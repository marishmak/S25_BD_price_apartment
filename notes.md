# Notes from the Stage 1 (and questions)

Does it have to be bash scripts? Wasn't mentioned in the guide...

--- 

Couldn't get a connection to 'hadoop-01.uni.innopolis.ru', with/without VPN, on/off university network, no idea.

---


> In the project, you should use at least one NoSQL database and here I just show a demo on SQL database.

So, the only database should be NoSQL? What are the options then? (mongo or cassandra I guess, but I don't feel like we need them?) And how is it supposed to be passed to the HDFS? (probably a stupid question but whatever)



---
> Note: You do not need to drop or create a database since it is already created by the TA.  
> Note: Do not forget, that the tasks in the project should not return errors when I run the stages for the second time, so you should clear/drop the objects before creating new ones.  

Contradictory?


---


> For the project, you need to import the data from Postgresql to HDFS using a big data file format (e.g. AVRO --as-avrodatafile, or Parquet --as-parquetfile) and compressed (e.g. in gzip --compression-codec=gzip (default), Snappy --compression-codec=snappy, or Bzip --compression-codec=bzip2).  
> Important: For the project, you should select one compression method and one file format that give you more efficient storage saving and fast data retrieval. Add the justification for your selection to the report.

AVRO & Snappy probably, if we want to better analyze each entry and not general stats. Haven't read it all yet.