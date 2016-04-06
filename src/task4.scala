val text = sc.textFile("data_input")
var singlehop = text.map(line => (line.split("\t")(0), line.split("\t")(1)))
var isPointedTo = text.map(line => (line.split("\t")(1), line.split("\t")(0)))
var hopsTo = isPointedTo.join(singlehop)
var doublehop = hopsTo.map(x => (x._2._1,x._2._2))
var unfilteredresult = singlehop union doublehop
val result = unfilteredresult.filter(x=> x._1 != x._2).sortByKey(true)
