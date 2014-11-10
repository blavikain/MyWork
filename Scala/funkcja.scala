def sumuj(args: Int*): Int = {
	var suma: Int = 0
	for (arg <- args) suma += Math.abs(arg)
	suma
}