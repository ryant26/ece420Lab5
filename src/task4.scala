val text = sc.textFile("data_input")
var edges = text.map(line => (line.split("\t")(0), line.split("\t")(1)))
var singlehop = edges.groupByKey()
var isPointedTo = text.map(line => (line.split("\t")(1), line.split("\t")(0)))
var isPointedToGroup = isPointedTo.groupByKey()
var hopsTo = isPointedToGroup.join(singlehop)
var doublehop = hopsTo.map(x => (x._2._1,x._2._2))
val result = singlehop union doublehop
