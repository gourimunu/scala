//Recursive Function Application 
//Multiple parameter
object tail
{
  def main (args:Array[String]): Unit =
  {
      println(gcd(14,21))
      println(factorial(2))
  }

def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)

def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)

}
