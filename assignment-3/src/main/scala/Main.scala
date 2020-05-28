// Assignment - 2

object Main extends App {
	println("-------------------------------------------------------");
	//// 1.	///////////////////////////////////////////////////
	def prime(n:Int, i:Int=2) :Boolean = {
		if(i<=n) {
			if(n%i==0 && i!=n) {
				return false;
			}
			prime(n, i+1);
		} else {
			return true;
		}
	}
	println("5 "+prime(5));
	println("8 " +prime(8));
	
	println("-------------------------------------------------------");
	//// 2.	///////////////////////////////////////////////////
	def primeSeq(n:Int) :Unit = {
		if(n<2)
			return;
		if(prime(n)) 
			println(n);
		primeSeq(n-1);
	}
	primeSeq(10);

	println("-------------------------------------------------------");
	//// 3.	///////////////////////////////////////////////////
	def sum(n:Int) :Int = {
		if(n>0) {
			return n + sum(n-1)
		} else {
			return 0;
		}
	}

	println("Sum(5) => " + sum(5));

	println("-------------------------------------------------------");
	//// 4.	///////////////////////////////////////////////////
	def isEven(n:Int) :Boolean = {
		if(n==0) 
			return true;
		else if(n==1)
			return false;
		else 
			return isEven(n - 2);
	}

	println("21 -> " + isEven(21));
	println("22 -> " + isEven(22));

	println("-------------------------------------------------------");
	//// 5.	///////////////////////////////////////////////////
	def allEvenSum(n:Int, i:Int=0) :Int = {
		if(n<2)
			return 0;
		if(isEven(n)) {
			return n-2 + allEvenSum(n-2, i+1);
		} else {
			return n-1 + allEvenSum(n-2,i+1);
		}
	}
	println(allEvenSum(12));

	println("-------------------------------------------------------");
	//// 6.	///////////////////////////////////////////////////
	def fibonacci(n:Int) :Int = {
		if(n<1) return 0;
		if(n==1)
			return 1;
		else {
			fibonacci(n-1) + fibonacci(n-2);
		}
	}
	def fibSeq(n:Int) :Unit = {
		if(n>=0) {
			fibSeq(n-1);
			println(fibonacci(n));
		}
	}

	fibSeq(10);
	
}