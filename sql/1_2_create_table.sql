DROP TABLE IF EXISTS real_estate;

CREATE TABLE real_estate (
    price INT,
    date VARCHAR(20),
    time VARCHAR(20),
    geo_lat FLOAT,
    geo_lon FLOAT,
    region INT,
    building_type INT,
    level INT,
    levels INT,
    rooms INT,
    area FLOAT,
    kitchen_area FLOAT,
    object_type INT
);
