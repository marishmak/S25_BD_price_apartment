#!/bin/bash

SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")
source "$ROOT_DIR/venv/bin/activate"

# Test connection & show databases
sqoop list-databases \
--connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team12_projectdb \
--username team12 \
--password $(cat $ROOT_DIR/secrets/.psql.pass)

# List tables
sqoop list-tables \
--connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team12_projectdb \
--username team12 \
--password $(cat $ROOT_DIR/secrets/.psql.pass)

# Import into HDFS
sqoop import-all-tables \
--connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team12_projectdb \
--username team12 \
--password $(cat $ROOT_DIR/secrets/.psql.pass) \
--compression-codec=snappy \
--compress \
--as-avrodatafile \
--warehouse-dir=project/warehouse \
--m 1
