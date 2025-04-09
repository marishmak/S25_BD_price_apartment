from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["huggingface_db"]
collection = db["real_estate"]

print("Sample real estate record:")
print(collection.find_one())
