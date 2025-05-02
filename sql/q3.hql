-- the query q3

USE team12_projectdb;
 
DROP TABLE IF EXISTS q3_results;
 
CREATE EXTERNAL TABLE q3_results(building_type INT, `level` INT, mean_price DECIMAL(10, 3), properties INT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'user/team12/project/hive/warehouse/q3'; 

USE team12_projectdb;

SET hive.resultset.use.unique.column.names = false;
 
INSERT INTO q3_results
SELECT
    building_type,
    `level`,
    AVG(price) AS mean_price,
    COUNT(*) AS properties
FROM real_estate
WHERE `level` IS NOT NULL
GROUP BY building_type, `level`
ORDER BY building_type, `level` ASC;
SELECT * FROM q3_results;