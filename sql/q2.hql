--the query q2

USE team12_projectdb;
 
DROP TABLE IF EXISTS q2_results;
 
CREATE EXTERNAL TABLE q2_results(rooms INT, area_bin DECIMAL(10, 2), mean_price DECIMAL(10, 3), properties INT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'user/team12/project/hive/warehouse/q2'; 

USE team12_projectdb;

SET hive.resultset.use.unique.column.names = false;
 
INSERT INTO q2_results
SELECT
    rooms,
    FLOOR(area/10)*10 AS area_bin,
    AVG(price) AS mean_price,
    COUNT(*) AS properties
FROM real_estate
WHERE rooms BETWEEN 1 AND 5 
  AND area BETWEEN 20 AND 200
GROUP BY rooms, FLOOR(area/10)*10
ORDER BY rooms, area_bin;
SELECT * FROM q2_results;