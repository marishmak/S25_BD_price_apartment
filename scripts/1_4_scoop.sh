#!/bin/bash

SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")
source "$ROOT_DIR/venv/bin/activate"

# Test connection & show databases
echo ">> List of all databases"
sqoop list-databases \
--connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team12_projectdb \
--username team12 \
--password $(cat $ROOT_DIR/secrets/.psql.pass)

# List tables
echo ">> Tables visible to team12"
sqoop list-tables \
--connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team12_projectdb \
--username team12 \
--password $(cat $ROOT_DIR/secrets/.psql.pass)

# Import real_estate into HDFS
sqoop import \
--connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team12_projectdb \
--username team12 \
--password $(cat $ROOT_DIR/secrets/.psql.pass) \
--table real_estate \
--compression-codec=snappy \
--compress \
--as-avrodatafile \
--warehouse-dir=project/warehouse \
--m 1 \
--bindir $ROOT_DIR/output \
--outdir $ROOT_DIR/output
