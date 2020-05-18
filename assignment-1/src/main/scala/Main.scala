

object Main extends App {
	// 1.  The temperature is 35C; convert this temperature into Fahrenheit.
	def temperatureInF(t:Double) :Double = t * 1.8 + 32.0

	println(temperatureInF(35) + "F");


	// 2. Volume of a sphere with radius 5
	def volumeOfSphere(r:Double) :Double = (4/3) * Math.PI * Math.pow(r,3)

	println(volumeOfSphere(5));

	// 3. Wholeslae cost
	// cost = copies * coverprice * (1-0.4) + shippingcost
	def coverCost(copies:Int, price:Double, discount:Double) :Double = {
		return copies * price * (1 - discount * 0.01)
	}

	def shippingcost(copies:Int) :Double = {
		if (copies <= 50)
			return copies * 3
		else 
			return 50 * 3 + (copies - 50) * 0.75
	}

	def wholeSaleCost(copies:Int) :Double = {
		return coverCost(copies, 24.95, 40) + shippingcost(copies)
	}

	println("Rs. " + wholeSaleCost(100))
}