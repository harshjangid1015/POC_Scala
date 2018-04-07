package sample

object TailRecursion {
  def main(args: Array[String]): Unit = {
    def sum(n: Int, acc: Int):Int =
      if(n == 0) acc else sum(n - 1, acc + n)
    val r = sum(10000, 0)
    println(r)
  }
}
