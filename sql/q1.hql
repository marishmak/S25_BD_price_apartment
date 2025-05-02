-- the query q1

USE team12_projectdb;

SELECT 
    region,
    SUM(price) AS total_price,
    COUNT(*) AS property_count,
    AVG(price) AS mean_price
FROM real_estate_part
WHERE region IS NOT NULL AND price IS NOT NULL
GROUP BY region
ORDER BY total_price DESC
LIMIT 10;

USE team12_projectdb;

DROP TABLE IF EXISTS q1_results;

CREATE EXTERNAL TABLE q1_results(region INT, total_price BIGINT, property_count INT, mean_price DECIMAL(10, 3))
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team12/project/hive/warehouse/q1';

USE team12_projectdb;

SET hive.resultset.use.unique.column.names = false;

INSERT INTO q1_results
SELECT 
    region,
    SUM(price) AS total_price,
    COUNT(*) AS property_count,
    AVG(price) AS mean_price
FROM real_estate_part
WHERE region IS NOT NULL AND price IS NOT NULL
GROUP BY region
ORDER BY total_price DESC
LIMIT 10;

SELECT * FROM q1_results;