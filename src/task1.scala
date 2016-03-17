val text = sc.textFile("data_input")
val result = text.map(line => (line.split("\t")(0), 1)).reduceByKey(_ + _).reduce((a,b) => if (a._2 < b._2) b else a)._1

// I believe I selected the wrong neighbor