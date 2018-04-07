package sample

object MoreMethodsOnCollections {
  def main(args: Array[String]): Unit = {
    def even(x: Int) = (x % 2) == 0
    val a = List(1,2,3,4,5,6,7)
    val b = List(2, 4, 6, 5, 10, 11, 13, 12)
    // are all members even?
    println(a.forall(even))
    // is there an even element in the sequence?
    println(a.exists(even))
    //take while the element is even
    //stop at the first odd element
    println(b.takeWhile(even))
    //partition into two sublists: even and odd
    println(a.partition(even))
  }
}
