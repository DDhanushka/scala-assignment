// Assignment - 2

object Main extends App {
	//// 1.	///////////////////////////////////////////////////

	def prime(n:Int, i:Int=2) :Boolean = {
		if(i<=n) {
			if(n%i==0) {
				if(n==2)
					return true;
				else 
					return false;
			} else {
				return true;
			}
			return prime(n, i+1);
		} else 
		return false;
	}
	println("5 "+prime(5));
	println("8 " +prime(8));

	//// 2.	///////////////////////////////////////////////////

}