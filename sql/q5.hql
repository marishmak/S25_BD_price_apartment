-- the query q5

USE team12_projectdb;
 
DROP TABLE IF EXISTS q5_results;
 
CREATE EXTERNAL TABLE q5_results(month INT, mean_price INT, properties INT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'user/team12/project/hive/warehouse/q5'; 

USE team12_projectdb;

SET hive.resultset.use.unique.column.names = false;
 
INSERT INTO q5_results
SELECT 
    level,
    COUNT(*) AS count_properties
FROM real_estate
WHERE level IS NOT NULL 
  AND level BETWEEN 1 AND 25
GROUP BY level
ORDER BY level;
SELECT * FROM q5_results;