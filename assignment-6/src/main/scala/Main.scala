object Main extends App {

	var p1 = new Point(1,2)
	var p2 = new Point(4,6)

	// Add two given points
	var p3 = p1 + p2
	println(p3.toString)

	println(p1);
	println(p2)

	// Move a point
	p1.move(10, 10)
	println(p1)

	var p4 = new Point(7, 10)
	println(p4.distance(p2))

	// Invert x and y
	p2.invert()
	println(p2)
	
}

class Point(var a:Int, var b:Int) {
	def x:Int = a
	def y:Int = b

	override def toString = "(" + x + ", " + y +")"

	def +(p:Point) = new Point(this.x + p.x, this.y + p.y)

	def move(dx:Int, dy:Int) :Unit = {
		a += dx
		b += dy
	}

	// Calculate distance 
	def distance(p:Point) :Double= {
		return Math.sqrt(Math.pow((a-p.x),2) + Math.pow((b-p.y),2))
	}

	// Invert x and y
	def invert() = {
		val tmp = a
		a = b
		b = tmp
	}
}