#!/bin/bash
set -e
set -o pipefail

# Constants
PROJECT_DIR=$(pwd)
OUTPUT_DIR="$PROJECT_DIR/output"
HDFS_BASE_PATH="/user/team12/warehouse"
HDFS_CSV_PATH="$HDFS_BASE_PATH/csv"
HDFS_DB_PATH="$HDFS_BASE_PATH/team12_db"
BEELINE_CONN="jdbc:hive2://hadoop-03.uni.innopolis.ru:10001/default"
PASSWORD_FILE="$PROJECT_DIR/secrets/.psql.pass"
HIVE_DATABASE="team12_db"

echo "=== Starting stage4.sh ==="
echo "Timestamp: $(date)"
echo "Working directory: $(pwd)"

# Create output dir
mkdir -p "$OUTPUT_DIR"

echo "Checking prerequisites..."
if [ ! -f "$PASSWORD_FILE" ]; then
    echo "ERROR: Password file not found at $PASSWORD_FILE"
    exit 1
fi

PASSWORD=$(cat "$PASSWORD_FILE")

echo "Checking CSV files in HDFS..."
REQUIRED_FILES=(
    "evaluation/evaluation.csv" 
    "model1_predictions/model1_predictions.csv"
    "model2_predictions/model2_predictions.csv"
    "model3_predictions/model3_predictions.csv"
)
for file in "${REQUIRED_FILES[@]}"; do
    hdfs dfs -test -e "$HDFS_CSV_PATH/$file"
    if [ $? -ne 0 ]; then
        echo "ERROR: Required file not found in HDFS: $file"
        exit 1
    fi
done

echo "Creating Hive database and tables..."

# Create HQL file dynamically
HQL_FILE="$OUTPUT_DIR/create_tables.hql"
cat > "$HQL_FILE" <<EOF
-- Create database with custom location
CREATE DATABASE IF NOT EXISTS $HIVE_DATABASE
LOCATION '$HDFS_DB_PATH';

USE $HIVE_DATABASE;

-- Create tables
CREATE EXTERNAL TABLE IF NOT EXISTS evaluation_metrics (
    model STRING,
    rmse DOUBLE,
    r2 DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '$HDFS_CSV_PATH/evaluation/';

CREATE EXTERNAL TABLE IF NOT EXISTS model1_predictions (
    id INT,
    predicted_price DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '$HDFS_CSV_PATH/model1_predictions/';

CREATE EXTERNAL TABLE IF NOT EXISTS model2_predictions (
    id INT,
    predicted_price DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '$HDFS_CSV_PATH/model2_predictions/';

CREATE EXTERNAL TABLE IF NOT EXISTS model3_predictions (
    id INT,
    predicted_price DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '$HDFS_CSV_PATH/model3_predictions/';
EOF

# Run the HQL script
beeline -u "$BEELINE_CONN" -n team12 -p "$PASSWORD" --hiveconf hive.resultset.use.unique.column.names=false -f "$HQL_FILE" | tee "$OUTPUT_DIR/hive_execution.log"

echo "Verifying table creation..."
beeline -u "$BEELINE_CONN" -n team12 -p "$PASSWORD" --hiveconf hive.resultset.use.unique.column.names=false -e "
    USE $HIVE_DATABASE;
    SHOW TABLES;
    DESCRIBE evaluation_metrics;
    SELECT * FROM evaluation_metrics LIMIT 5;
"
