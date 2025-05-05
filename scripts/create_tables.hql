-- Using team's database
USE team12;

-- Evaluation metrics table
CREATE EXTERNAL TABLE IF NOT EXISTS evaluation_metrics (
    model_name STRING,
    rmse DOUBLE,
    r2_score DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/evaluation.csv'
TBLPROPERTIES ('skip.header.line.count'='1');

-- Model predictions tables
CREATE EXTERNAL TABLE IF NOT EXISTS model1_predictions (
    id INT,
    actual_value DOUBLE,
    predicted_value DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/model1_predictions.csv'
TBLPROPERTIES ('skip.header.line.count'='1');

CREATE EXTERNAL TABLE IF NOT EXISTS model2_predictions (
    id INT,
    actual_value DOUBLE,
    predicted_value DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/model2_predictions.csv'
TBLPROPERTIES ('skip.header.line.count'='1');

CREATE EXTERNAL TABLE IF NOT EXISTS model3_predictions (
    id INT,
    actual_value DOUBLE,
    predicted_value DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/model3_predictions.csv'
TBLPROPERTIES ('skip.header.line.count'='1');
