// Assignment - 2

object Main extends App {
	//// 1.	///////////////////////////////////////////////////

	def takeHomeSalaray(wh:Int, oh:Int) :Double= {
		return income(wh, oh) - tax(income(wh, oh), 10);
	}

	def income(wh:Int, oh:Int) :Int = {
		return workingHourSalaray(wh, 150) + otHourSalary(oh, 75);
	}

	def tax(income:Int, tax:Int) :Double = {
		return income * tax * 0.01;
	}

	def workingHourSalaray(wh:Int, n:Int) :Int = {
		return wh * n;
	}

	def otHourSalary(oh:Int, n:Int) :Int = {
		return oh * n;
	}

	println("Take home salaray = " + takeHomeSalaray(40, 20));

	//// 2.	///////////////////////////////////////////////////
}