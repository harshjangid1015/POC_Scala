package sample

object HigherOrderFunctionDemo {
  def main(args: Array[String]): Unit = {

    def identity(x: Int) = x
    def sqr(x: Int) = x * x
    def cube(x: Int) = x * x * x
    def sum(f: Int=>Int, a: Int, b: Int): Int =
      if (a == b) f(a) else f(a) + sum(f, a + 1, b)
    println(sum(identity, 1, 10))
    println(sum(sqr, 1, 10))
    println(sum(cube, 1, 10))

    println()
    // or same can be written sing anonymous functions
    println(sum(x => x, 1, 10))
    println(sum(x => x*x, 1, 10))
    println(sum(x => x*x*x, 1, 10))

  }
}
