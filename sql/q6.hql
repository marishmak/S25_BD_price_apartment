-- the query q6

USE team12_projectdb;
 
DROP TABLE IF EXISTS q6_results;
 
CREATE EXTERNAL TABLE q6_results(rooms INT, mean_price INT, min_price INT, max_price INT, properties_count INT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'user/team12/project/hive/warehouse/q6'; 

USE team12_projectdb;

SET hive.resultset.use.unique.column.names = false;
 
INSERT INTO q6_results
SELECT 
    rooms,
    AVG(price) AS mean_price,
    MIN(price) AS min_price,
    MAX(price) AS max_price,
    COUNT(*) AS properties_count
FROM real_estate
WHERE rooms BETWEEN 1 AND 5
GROUP BY rooms
ORDER BY rooms;
SELECT * FROM q6_results;