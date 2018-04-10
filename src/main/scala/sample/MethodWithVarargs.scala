package sample

object MethodWithVarargs {
   def printAll(strings: String*){
     strings.foreach(println)
   }

  def main(args: Array[String]): Unit = {
    println()
    println("foo")
    println("foo", "bar")
    println("foo", "bar", "baz")
  }
}
