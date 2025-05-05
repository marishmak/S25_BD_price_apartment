-- Create database with custom location
CREATE DATABASE IF NOT EXISTS team12_db
LOCATION '/user/team12/warehouse/team12_db';

USE team12_db;

-- Create tables
CREATE EXTERNAL TABLE IF NOT EXISTS evaluation_metrics (
    model STRING,
    rmse DOUBLE,
    r2 DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/evaluation/';

CREATE EXTERNAL TABLE IF NOT EXISTS model1_predictions (
    id INT,
    predicted_price DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/model1_predictions/';

CREATE EXTERNAL TABLE IF NOT EXISTS model2_predictions (
    id INT,
    predicted_price DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/model2_predictions/';

CREATE EXTERNAL TABLE IF NOT EXISTS model3_predictions (
    id INT,
    predicted_price DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team12/warehouse/csv/model3_predictions/';
