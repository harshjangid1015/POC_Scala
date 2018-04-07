package sample

//In cases where you want to build a new collection from the input collection, use the for/yield combination:
object ForLoopWithYield {
  def main(args: Array[String]): Unit = {
    val a = Array("apple", "banana", "orange")

    val newArray = for (e <- a) yield {
      // imagine this requires multiple lines
      val s = e.toUpperCase
      println(s)
    }
  }
}
//newArray: Array[java.lang.String] = Array(APPLE, BANANA, ORANGE)