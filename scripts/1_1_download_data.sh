#!/bin/bash
set -e
SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")

echo "$SCRIPT_DIR"
echo "$ROOT_DIR"

mkdir -p "$ROOT_DIR/data"
source "$ROOT_DIR/venv/bin/activate"
#pip install -r "$ROOT_DIR/requirements.txt"

curl -L -o ./data/Russia_Real_Estate_2021.csv https://huggingface.co/datasets/daniilak/Russia_Real_Estate_2021/resolve/main/data.csv

echo "Russia Real Estate dataset downloaded to ./data/Russia_Real_Estate_2021.csv"
