import os
import psycopg2
import pandas as pd
from psycopg2 import extras

# Directory setup
ROOT_DIR = os.path.realpath(os.path.join(os.path.dirname(__file__), ".."))
SECRETS_PATH = os.path.join(ROOT_DIR, "secrets", ".psql.pass")
CSV_PATH = os.path.join(ROOT_DIR, "data", "Russia_Real_Estate_2021.csv")
SQL_FILE = os.path.join(ROOT_DIR, "sql", "1_2_create_table.sql")

# Load DB password
with open(SECRETS_PATH, "r") as f:
    password = f.read().strip()

print("Connecting to psql...")
# Connect to PostgreSQL
conn = psycopg2.connect(
    host="hadoop-04.uni.innopolis.ru",
    port=5432,
    user="team12",
    password=password,
    dbname="team12_projectdb"
)
cursor = conn.cursor()

# Create table
with open(SQL_FILE, "r") as f:
    cursor.execute(f.read())
conn.commit()

# Load CSV
df = pd.read_csv(CSV_PATH)
print(f"Loading {df.shape[0]} rows into psql.")

# Prepare data for batch insert
data = df.values.tolist()
# Insert in batch
batch_size = 10000
insert_query = """
    INSERT INTO real_estate (
        price, date, time, geo_lat, geo_lon, region, building_type,
        level, levels, rooms, area, kitchen_area, object_type
    ) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)
"""
for i in range(0, len(data), batch_size):
    batch = data[i:i+batch_size]
    extras.execute_batch(cursor, insert_query, batch)
    conn.commit()
    
    if i % (10 * batch_size) == 0:
        print(f"Inserted {i} rows...")
#conn.commit()

# Sanity check
cursor.execute("SELECT COUNT(*) FROM real_estate")
print("Loaded rows into real_estate:", cursor.fetchone()[0], "!")

cursor.close()
conn.close()