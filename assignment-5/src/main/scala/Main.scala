object Main extends App {
	
	// 1: Data Structure for Rational Number
	class Rational(x:Int, y:Int) {
		private def gcd(a:Int, b:Int) :Int = {
			if(b==0) a else gcd(b, a%b)
		}
		private val g = gcd(x,y)
		def num = x/g;
		def den = y/g;

		// 1:: method neg()
		def neg() = new Rational(-this.num, this.den)

		// 2: method sub to subtract two rational numbers
		def -(r:Rational) = new Rational(this.num*r.den - r.num*this.den, den*r.den)

		override def toString = num + "/" + den;
	}

	val x = new Rational(3,4)
	val y = new Rational(5,8)
	val z = new Rational(2,7)

	// 2: answer x-y-z = 9/-56
	val answer = x-y-z
	println(answer.toString)

	// 3: Data Structure for Account
	class Account(id:String, accN:Int, b:Double) {
		val nic:String = id
		val accNumber:Int = accN
		var balance:Double = b

		// 3: method transfer
		def transfer(acc:Account, amt:Double) = {
			this.balance -= amt
			acc.balance += amt
		}

		override def toString = "[" + nic + ":" + accNumber + ":" + balance +"$]"
	}

	var acc1 = new Account("1111v", 12, 1200.0)
	var acc2 = new Account("1511v", 16, -100.0)
	var acc3 = new Account("1121v", 11, 200.0)

	val bank:List[Account] = List(acc1, acc2, acc3)
	
	val totalBalance = (bank:List[Account]) => bank.reduce((ac1, ac2) => new Account("", 0, ac1.balance+ac2.balance)).balance
	val overdraft = (bank: List[Account]) => bank.filter(ac => ac.balance<0)
	val interest = (bank: List[Account]) => bank.map(ac=>if(ac.balance >=0) ac.balance*1.05 else ac.balance*1.1)
	val balanceAfterInterest = (interest: List[Double]) => interest.reduce((int1, int2) => int1 + int2) 
	// 4.1
	println("Accounts with negative balance => " + overdraft(bank).toString)
	// 4.2
	println("Sum of all account balances => " + totalBalance(bank))
	// 4.3
	println("Final balance of all accounts after apply interest function  => " + balanceAfterInterest(interest(bank)))

}