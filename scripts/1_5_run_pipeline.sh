#!/bin/bash

SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")
source "$ROOT_DIR/venv/bin/activate"

# Load PostgreSQL setup
which python3.11
pip list | grep psycopg2
python3.11 "$ROOT_DIR/sql/1_3_load_data.py"

# run scoop
bash "$ROOT_DIR/scripts/1_4_scoop.sh"