package sample

object LazyValDemo {
  def hello() = {
    println("hello")
    10
  }

  def main(args: Array[String]): Unit = {
    val a = hello()   //will print hello

    lazy val b = hello()    //will not print hello

    println(b + b)    //now it will work

  }
}
