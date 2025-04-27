#!/bin/bash

SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")
source "$ROOT_DIR/venv/bin/activate"

hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put $ROOT_DIR/output/*.avsc project/warehouse/avsc