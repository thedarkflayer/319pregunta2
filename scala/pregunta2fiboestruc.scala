object fibonacci {
	
	def fibestru(n: Int):Int = {
	var a = -1
	var b = 1
	var c = 0
	var d = 0
	var i = 0
	while( i < n ) {
	a = b
	b = c
	c = d
	i = i + 1
	d = temporal(a,b,c)
	}
	return d
	}
	
	def fibonacci_estruc(tamano: Int):Unit = {
	for (i <-0 to (tamano-1)){
	System.out.print(fibestru(i)+" ")
	}
	}
	
	val temporal = (a: Int, b: Int, c: Int)=> a+b+c
	
	def main(args:Array[String]):Unit = {
	println("ingrese el numero de fibonaccis a imprimir : ")
	val a = scala.io.StdIn.readInt()
	fibonacci_estruc(a)
	}
	
	
}