import scala.io.Source
Source.fromPath("myfile.txt").getLines().foreach {
	line => println(line)
}