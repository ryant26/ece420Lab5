val text = sc.textFile("data_input")
var edges = text.map(line => (line.split("\t")(0), line.split("\t")(1)))
var adjacency = edges.groupByKey()

var comp = edges.flatmap { x=>
	edges.filter(y => y.1)
}