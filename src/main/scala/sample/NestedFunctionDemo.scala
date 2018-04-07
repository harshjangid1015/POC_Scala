package sample

object NestedFunctionDemo {
  def main(args: Array[String]): Unit = {
    println(f(10))
  }
  // fun returns a function of type Int => Int
  def fun():Int => Int = {
    def sqr(x: Int):Int = x * x
    sqr
  }
  val f = fun()
  /*
  * def fun():Int=>Int says ”fun is a function which does not take any
    argument and returns a function which maps an Int to an Int. Note
    that it possible to have ”nested” function definitions.*/

}
