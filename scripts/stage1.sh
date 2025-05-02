#!/bin/bash

SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")

echo ">> Creating venv..."
bash "$SCRIPT_DIR/1_0_create_venv.sh"

echo ">> Downloading data..."
bash "$SCRIPT_DIR/1_1_download_data.sh"

echo ">> Running pipeline..."
bash "$SCRIPT_DIR/1_5_run_pipeline.sh"
