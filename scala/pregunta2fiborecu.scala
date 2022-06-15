object fibonacci {
  
  def fibo(n: Int):Int = {
  if (n == 0){
  return 0
  }else if (n == 1){
  return 1
  }else if (n == 2){
  return 1
  }else{
  return (temporal (n))
  }
  }
  
  def fi(tamano: Int):Unit = {
  for (i <-0 to (tamano-1)){
  System.out.print(fibo(i)+" ")
  }
  }
  
  val temporal = (n: Int)=> fibo(n-1)+fibo(n-2)+fibo(n-3)
  
  def main(args:Array[String]):Unit = {
  println("Dame un valor a: ")
  val a = scala.io.StdIn.readInt()
  fi(a)
  }
  
}