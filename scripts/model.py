import os
from pyspark.sql.types import *
import pyspark.sql.functions as F
from pyspark.ml.feature import VectorAssembler, MinMaxScaler
from pyspark.ml import Pipeline
from pyspark.ml.regression import LinearRegression, RandomForestRegressor, GBTRegressor
from pyspark.ml.tuning import ParamGridBuilder, CrossValidator
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.sql import SparkSession

# Set Hadoop/YARN configurations
os.environ['HADOOP_CONF_DIR'] = '/etc/hadoop/conf'
os.environ['YARN_CONF_DIR'] = '/etc/hadoop/conf'

def run(command):
    '''execute the command'''
    return os.popen(command).read()

TEAM = 12
WAREHOUSE = "project/hive/warehouse"

run('echo "=== Initializing Spark Session ==="')
# Initialize Spark Session
spark = SparkSession.builder\
        .appName(f"{TEAM} - spark ML")\
        .master("yarn")\
        .config("hive.metastore.uris", "thrift://hadoop-02.uni.innopolis.ru:9883")\
        .config("spark.sql.warehouse.dir", WAREHOUSE)\
        .config("spark.sql.avro.compression.codec", "snappy")\
        .enableHiveSupport()\
        .getOrCreate()

run('echo "=== Reading data from Hive table ==="')
# Read data from Hive
df = spark.read.format("avro").table('team12_projectdb.real_estate')

run('echo "=== Preparing data and selecting features ==="')
# Data Preparation
target = 'price'
features = ['geo_lat', 'geo_lon', 'region', 'building_type', 
            'level', 'levels', 'rooms', 'area', 'kitchen_area', 'object_type']

df = df.select(features + [target]).na.drop()

run('echo "=== Performing feature engineering ==="')
# Feature Engineering
df = df.withColumn("floor_ratio", F.col('level') / F.col('levels'))

# Numeric columns for feature vector
numeric_cols = ['geo_lat', 'geo_lon', 'region', 'building_type',
               'rooms', 'area', 'kitchen_area', 'object_type', 'floor_ratio']

run('echo "=== Building feature pipeline ==="')
# Feature Pipeline
assembler = VectorAssembler(inputCols=numeric_cols, outputCol="raw_features")
scaler = MinMaxScaler(inputCol="raw_features", outputCol="features")

pipeline = Pipeline(stages=[assembler, scaler])
preprocessor = pipeline.fit(df)
processed_df = preprocessor.transform(df)

# Prepare final dataset
final_data = processed_df.select(F.col('features'), F.col(target).alias('label'))

run('echo "=== Splitting data into train and test sets ==="')
# Split data
train_data, test_data = final_data.randomSplit([0.7, 0.3], seed=42)

run('echo "=== Saving train/test data to HDFS ==="')
# Save train/test data
train_data.coalesce(1).write.mode("overwrite").json("project/data/train")
test_data.coalesce(1).write.mode("overwrite").json("project/data/test")

run('echo "=== Copying train/test data to local ==="')
# Copy to local
run("hdfs dfs -cat project/data/train/*.json > data/train.json")
run("hdfs dfs -cat project/data/test/*.json > data/test.json")

# Initialize evaluators
evaluator = RegressionEvaluator(labelCol="label", predictionCol="prediction")

# Model 1: Random Forest
run('echo "=== Starting Random Forest model training ==="')
rf = RandomForestRegressor(featuresCol="features", labelCol="label")

rf_param_grid = ParamGridBuilder() \
    .addGrid(rf.maxDepth, [5, 10]) \
    .addGrid(rf.numTrees, [20, 50]) \
    .build()

rf_crossval = CrossValidator(
    estimator=rf,
    estimatorParamMaps=rf_param_grid,
    evaluator=evaluator,
    numFolds=3
)

print("Training Random Forest model...")
rf_cv_model = rf_crossval.fit(train_data)
best_rf = rf_cv_model.bestModel

run('echo "=== Saving Random Forest model to HDFS ==="')
# Save RF model
best_rf.write().overwrite().save("project/models/model1")

run('echo "=== Generating Random Forest predictions ==="')
# RF predictions and evaluation
rf_predictions = best_rf.transform(test_data)
rf_predictions.select("label", "prediction") \
    .coalesce(1) \
    .write \
    .mode("overwrite") \
    .csv("project/output/model1_predictions")

run("hdfs dfs -cat project/output/model1_predictions/*.csv > output/model1_predictions.csv")

rf_rmse = evaluator.setMetricName("rmse").evaluate(rf_predictions)
rf_r2 = evaluator.setMetricName("r2").evaluate(rf_predictions)

run(f'echo "Random Forest - RMSE: {rf_rmse}, R2: {rf_r2}"')

# Model 2: Linear Regression
run('echo "=== Starting Linear Regression model training ==="')
lr = LinearRegression(featuresCol="features", labelCol="label")

lr_param_grid = ParamGridBuilder() \
    .addGrid(lr.regParam, [0.01, 0.1]) \
    .addGrid(lr.elasticNetParam, [0.0, 0.5]) \
    .build()

lr_crossval = CrossValidator(
    estimator=lr,
    estimatorParamMaps=lr_param_grid,
    evaluator=evaluator,
    numFolds=3
)

print("Training Linear Regression model...")
lr_cv_model = lr_crossval.fit(train_data)
best_lr = lr_cv_model.bestModel

run('echo "=== Saving Linear Regression model to HDFS ==="')
# Save LR model
best_lr.write().overwrite().save("project/models/model2")

run('echo "=== Generating Linear Regression predictions ==="')
# LR predictions and evaluation
lr_predictions = best_lr.transform(test_data)
lr_predictions.select("label", "prediction") \
    .coalesce(1) \
    .write \
    .mode("overwrite") \
    .csv("project/output/model2_predictions")

run("hdfs dfs -cat project/output/model2_predictions/*.csv > output/model2_predictions.csv")

lr_rmse = evaluator.setMetricName("rmse").evaluate(lr_predictions)
lr_r2 = evaluator.setMetricName("r2").evaluate(lr_predictions)

run(f'echo "Linear Regression - RMSE: {lr_rmse}, R2: {lr_r2}"')

# Model 3: Gradient-Boosted Trees
run('echo "=== Starting Gradient-Boosted Trees model training ==="')
gbt = GBTRegressor(featuresCol="features", labelCol="label")

gbt_param_grid = ParamGridBuilder() \
    .addGrid(gbt.maxDepth, [3, 5]) \
    .addGrid(gbt.maxIter, [20, 50]) \
    .build()

gbt_crossval = CrossValidator(
    estimator=gbt,
    estimatorParamMaps=gbt_param_grid,
    evaluator=evaluator,
    numFolds=3
)

print("Training Gradient-Boosted Trees model...")
gbt_cv_model = gbt_crossval.fit(train_data)
best_gbt = gbt_cv_model.bestModel

run('echo "=== Saving Gradient-Boosted Trees model to HDFS ==="')
# Save GBT model
best_gbt.write().overwrite().save("project/models/model3")

run('echo "=== Generating Gradient-Boosted Trees predictions ==="')
# GBT predictions and evaluation
gbt_predictions = best_gbt.transform(test_data)
gbt_predictions.select("label", "prediction") \
    .coalesce(1) \
    .write \
    .mode("overwrite") \
    .csv("project/output/model3_predictions")

run("hdfs dfs -cat project/output/model3_predictions/*.csv > output/model3_predictions.csv")

gbt_rmse = evaluator.setMetricName("rmse").evaluate(gbt_predictions)
gbt_r2 = evaluator.setMetricName("r2").evaluate(gbt_predictions)

run(f'echo "Gradient-Boosted Trees - RMSE: {gbt_rmse}, R2: {gbt_r2}"')

# Create comparison dataframe
comparison_data = [
    ("Random Forest", rf_rmse, rf_r2),
    ("Linear Regression", lr_rmse, lr_r2),
    ("Gradient-Boosted Trees", gbt_rmse, gbt_r2)
]

comparison_df = spark.createDataFrame(comparison_data, ["Model", "RMSE", "R2"])

run('echo "=== Saving model comparison results ==="')
# Save comparison results
comparison_df.coalesce(1) \
    .write \
    .mode("overwrite") \
    .csv("project/output/evaluation")

run("hdfs dfs -cat project/output/evaluation/*.csv > output/evaluation.csv")

run('echo "=== Final Model Comparison ==="')
print("=== Model Comparison ===")
comparison_df.show(truncate=False)

run('echo "=== Job completed successfully ==="')
spark.stop()