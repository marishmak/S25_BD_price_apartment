-- the query q4

USE team12_projectdb;
 
DROP TABLE IF EXISTS q4_results;
 
CREATE EXTERNAL TABLE q4_results(mean_price DECIMAL(10, 3), properties INT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'user/team12/project/hive/warehouse/q4'; 

USE team12_projectdb;

SET hive.resultset.use.unique.column.names = false;
 
INSERT INTO q4_results
SELECT 
    building_type,
    AVG(price) AS mean_price,
    COUNT(*) AS properties
FROM real_estate
WHERE building_type IS NOT NULL
GROUP BY building_type
ORDER BY avg_price DESC;
SELECT * FROM q4_results;