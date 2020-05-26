// Assignment - 2

object Main extends App {
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

	//// 2.	///////////////////////////////////////////////////
	def primeSeq(x:Int) = {
		
	}

}