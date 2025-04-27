#!/bin/bash
SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")

python3.11 -m venv "$ROOT_DIR/venv"
source "$ROOT_DIR/venv/bin/activate"
pip install --upgrade pip
pip install -r "$ROOT_DIR/requirements.txt"
