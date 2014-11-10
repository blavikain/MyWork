def pierw(a: Int, b: Int, c: Int) = {
	var delta = b*b - 4*a*c
	if (delta < 0) println(0)
	if (delta == 0) println(1)
	if (delta > 0) println(2)	
}