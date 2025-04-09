import json
from pymongo import MongoClient
import os

root_dir = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
data_path = os.path.join(root_dir, "data", "russia_real_estate.json")

client = MongoClient("mongodb://localhost:27017/")
db = client["huggingface_db"]
collection = db["real_estate"]

with open(data_path, "r") as f:
    records = [json.loads(line) for line in f]

collection.insert_many(records)
print(f"Inserted {len(records)} real estate records into MongoDB.")
