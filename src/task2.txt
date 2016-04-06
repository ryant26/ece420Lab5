val text = sc.textFile("data_input")
var result = text.map(line => (line.split("\t")(0), line.split("\t")(1))).groupByKey()
