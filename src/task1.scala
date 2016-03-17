import scala.io.Source

val nodes = scala.collection.mutable.HashMap.empty[Int,Int]

Source.fromFile("data_input").getLines().foreach { line => 
	println(s"line: $line")
	var tokens = line.split(" +")

	println(s"tokens 0: $tokens(0), tokens 1: $tokens(1)")
	if (tokens.length > 1){
		var fromNode = tokens(0).toInt
		var toNode = tokens(1).toInt

		if (nodes.contains(fromNode)){
			nodes(fromNode) = nodes(fromNode) + 1
		} else {
			nodes(fromNode) = 1
		}	
	}
}

var maxValue = -1
var maxNode = -1

nodes.keys.foreach { node =>
	if (nodes(node) > maxValue){
		maxValue = nodes(node)
		maxNode = nodes(node)
	}
}

println(s"maxNode: $maxNode, with value: $maxValue")