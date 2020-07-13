

object Main extends App {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val E = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)+key)%a.size)

	val D = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)-key)%a.size)

	val cipher = (algo:(Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_, key, a))

	// Encrypting
	var msg = "please disable the main system asap"
	val ct = cipher(E, msg, 5, alphabet)
	println("<<Encrypted>> " + ct);

	// Decrypting
	val pt = cipher(D, ct, 5, alphabet)
	println("<<Decrypted>> " + pt);
}
