val text = sc.textFile("data_input")
val result = text.map(line => (line.split("\t")(1), 1)).reduceByKey(_ + _).reduce((a,b) => if (a._2 < b._2) b else a)._2