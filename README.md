# Apartment price prediction in Russia
## S25 - Big Data
---
### Team 12 members:
|name|email|role|
|-|----------|----|
|Bogdan Shah|b.shakh@innopolis.university|Data engineer|
|Mariia Shmakova|m.shmakova@innopolis.university|ML specialist|
|Aruzhan Shinbayeva | a.shinbaeyeva@innopolis.university|Tester and Technical writer|
|Alsu Khairullina | a.khairullina@innopolis.university|Data scientist|


### Project Description
The project focuses on predicting apartment prices in the Russian real estate market using regression modeling, leveraging a dataset of real estate advertisements from platforms like avito.ru and cian.ru. The dataset includes features such as property type, geolocation, building type, number of rooms, and region, but faces challenges like data duplication, inaccuracies, and incomplete information. By preprocessing the data, performing feature engineering, and evaluating regression models, the project aims to develop an accurate price prediction model while analyzing market trends and improving data quality. The outcomes will provide reliable price forecasts, insights into key market drivers, and highlight the need for standardized real estate datasets, benefiting buyers, sellers, and real estate professionals in Russia.

### Dataset

[Link](https://huggingface.co/datasets/daniilak/Russia_Real_Estate_2021) to our dataset.

#### Original dataset description

Link to original dataset [description.](https://huggingface.co/datasets/daniilak/Russia_Real_Estate_2021/blob/main/README.md)

#### Features description:
- price: Represents the cost of the property.  
- date: Indicates the date when the data was recorded.  
- time: Specifies the timestamp or time identifier for the record.  
- geo_lat: Provides the geographical latitude of the property location.  
- geo_lon: Provides the geographical longitude of the property location.  
- region: Identifies the administrative or geographical region of the property.  
- building_type: Describes the type of building (building type - 0 - Don't know. 1 - Other. 2 - panel. 3 - Monolithic. 4 - Brick. 5 - blocky. 6- Wooden).  
- level: Specifies the floor number of the property within the building.  
- levels: Indicates the total number of floors in the building.  
- rooms: Counts the number of rooms in the property.  
- area: Measures the total area of the property, typically in square meters.  
- kitchen_area: Specifies the area of the kitchen, if available.  
- object_type: Categorizes the type of property(0 - Secondary real estate market; 2 - New building).

### Additional dataset parameters:
- Dataset File format: csv
- Dataset files: train.csv
- Number of records: 5477006
- Size of dataset: 408 MB
- Number of features: 13
- ML Task: Regression
- Target column: price
- Has time or geospatial features: both
- Time/Geospatial features: time, geo_lat, geo_lon
