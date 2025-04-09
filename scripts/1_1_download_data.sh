#!/bin/bash
set -e
SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")

echo "$SCRIPT_DIR"
echo "$ROOT_DIR"

mkdir -p "$ROOT_DIR/data"
source "$ROOT_DIR/venv/bin/activate"
#pip install -r "$ROOT_DIR/requirements.txt"

python3 - <<EOF
from datasets import load_dataset
dataset = load_dataset("daniilak/Russia_Real_Estate_2021", split="train")
dataset.to_json("$ROOT_DIR/data/russia_real_estate.json", orient="records", lines=True)
EOF

echo "Russia Real Estate dataset downloaded to ./data/russia_real_estate.json"
