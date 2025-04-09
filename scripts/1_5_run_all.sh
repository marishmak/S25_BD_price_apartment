#!/bin/bash
set -e
SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")

echo "Step 0: Create venv"
bash "$SCRIPT_DIR/1_0_create_venv.sh"

source "$ROOT_DIR/venv/bin/activate"

echo "Step 1: Download dataset"
bash "$SCRIPT_DIR/1_1_download_data.sh"

echo "Step 2: Create MongoDB collection"
python3 "$SCRIPT_DIR/1_2_create_collections.py"

echo "Step 3: Import data"
python3 "$SCRIPT_DIR/1_3_import_data.py"

echo "Step 4: Test DB"
python3 "$SCRIPT_DIR/1_4_test_db.py"
