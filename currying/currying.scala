//Multiple parameter
object currying
{
  def add(a:Int, b:Int)= (a+b)

  def addnew(a:Int)={(b:Int)=>a+b}

  def main (args:Array[String]): Unit =
  {
    println("result = "+ add(20,39))
    println("Currying "+ addnew(5)(45))
  }

  def curry(x:Int):Int=>Int=y=> y+x
  val x = curry(6)
  println(x(7))
}
