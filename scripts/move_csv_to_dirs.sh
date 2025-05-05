#!/bin/bash
set -e
set -o pipefail

HDFS_BASE_PATH="/user/team12/warehouse"
HDFS_CSV_PATH="$HDFS_BASE_PATH/csv"

echo "=== Starting CSV reorganization ==="
echo "Timestamp: $(date)"

declare -A FILE_DIR_MAP=(
    ["evaluation.csv"]="evaluation"
    ["model1_predictions.csv"]="model1_predictions"
    ["model2_predictions.csv"]="model2_predictions"
    ["model3_predictions.csv"]="model3_predictions"
)

echo "Reorganizing CSV files in HDFS..."

for file in "${!FILE_DIR_MAP[@]}"; do
    target_dir="${FILE_DIR_MAP[$file]}"
    target_path="$HDFS_CSV_PATH/$target_dir"
    
    echo "Processing $file → $target_dir"
    
    if ! hdfs dfs -test -e "$HDFS_CSV_PATH/$file"; then
        echo "WARNING: Source file not found: $file"
        continue
    fi
    
    hdfs dfs -mkdir -p "$target_path"
    
    hdfs dfs -mv "$HDFS_CSV_PATH/$file" "$target_path/"
    
    echo "Moved $file to $target_path/"
done

echo "Verifying new structure..."
hdfs dfs -ls -R "$HDFS_CSV_PATH"

echo "=== CSV reorganization complete ==="