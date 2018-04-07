package sample

object RecursionExample {
  def main(args: Array[String]): Unit = {
    // sum n + (n-1) + (n-2) + ... + 0
    def sum(n: Int): Int =
      if (n == 0) 0 else n + sum(n - 1)
    val m = sum(10)
    println(m)
  }
}
