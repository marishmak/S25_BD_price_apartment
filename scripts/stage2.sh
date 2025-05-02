#!/bin/bash

# set password
SCRIPT_DIR=$(dirname "$0")
ROOT_DIR=$(realpath "$SCRIPT_DIR/..")
password=$(cat $ROOT_DIR/secrets/.psql.pass)

# create warehouse directory in hdfs if not exists and put avsc files
hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put $ROOT_DIR/output/*.avsc project/warehouse/avsc
 
# run db.hql and save the output to hive_results.txt
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team12 -p $password -f ./sql/db.hql > $ROOT_DIR/output/hive_results.txt

# run q1.hql, q2.hql, q3.hql, q4.hql, q5.hql, q6.hql
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team12 -p $password -f ./sql/q1.hql --hiveconf hive.resultset.use.unique.column.names=false > $ROOT_DIR/output/q1.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team12 -p $password -f ./sql/q2.hql --hiveconf hive.resultset.use.unique.column.names=false > $ROOT_DIR/output/q2.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team12 -p $password -f ./sql/q3.hql --hiveconf hive.resultset.use.unique.column.names=false > $ROOT_DIR/output/q3.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team12 -p $password -f ./sql/q4.hql --hiveconf hive.resultset.use.unique.column.names=false > $ROOT_DIR/output/q4.csv

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team12 -p $password -f ./sql/q5.hql --hiveconf hive.resultset.use.unique.column.names=false > $ROOT_DIR/output/q5.csv

# quality rate hive_execute.py
pylint scripts/hive_execute.py