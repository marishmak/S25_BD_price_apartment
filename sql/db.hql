SET hive.exec.dynamic.partition=true;
SET hive.exec.dynamic.partition.mode=nonstrict;
SET hive.execution.engine=tez;

DROP DATABASE IF EXISTS team12_projectdb CASCADE;

SHOW DATABASES;

CREATE DATABASE team12_projectdb LOCATION "project/hive/warehouse";

USE team12_projectdb;

SHOW DATABASES;

CREATE EXTERNAL TABLE real_estate STORED AS AVRO LOCATION 'project/warehouse/real_estate' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/real_estate.avsc');

SHOW TABLES;

describe real_estate;

CREATE EXTERNAL TABLE real_estate_part (
    price INT,
    `date` VARCHAR(50),
    `time` VARCHAR(50),
    geo_lat DECIMAL(10, 6),
    geo_lon DECIMAL(10, 6),
    building_type INT,
    `level` INT,
    levels INT,
    rooms INT,
    area DECIMAL(10, 2),
    kitchen_area DECIMAL(10, 2),
    object_type INT
) PARTITIONED BY (region INT) STORED AS AVRO LOCATION '/user/team12/project/hive/warehouse/real_estate_part' TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY');


CREATE EXTERNAL TABLE real_estate_buck (
    price INT,
    `date` VARCHAR(50),
    `time` VARCHAR(50),
    geo_lat DECIMAL(10, 6),
    geo_lon DECIMAL(10, 6),
    region INT,
    building_type INT,
    `level` INT,
    levels INT,
    rooms INT,
    area DECIMAL(10, 2),
    kitchen_area DECIMAL(10, 2)
) PARTITIONED BY (object_type INT) CLUSTERED BY (building_type) INTO 10 BUCKETS STORED AS AVRO LOCATION '/user/team12/project/hive/warehouse/real_estate_bucketed' TBLPROPERTIES ('avro.output.codec'='snappy');

describe real_estate_part;
describe real_estate_buck;

INSERT OVERWRITE TABLE real_estate_part PARTITION (region)
SELECT 
    price,
    `date`,
    `time`,
    geo_lat,
    geo_lon,
    building_type,
    `level`,
    levels,
    rooms,
    area,
    kitchen_area,
    object_type,
    region     
FROM real_estate;


INSERT INTO TABLE real_estate_buck
SELECT 
    price,
    `date`,
    `time`,
    geo_lat,
    geo_lon,
    region,
    building_type,
    `level`,
    levels,
    rooms,
    area,
    kitchen_area,
    object_type    
FROM real_estate;