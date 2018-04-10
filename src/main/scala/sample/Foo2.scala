package sample

class Foo2 {
  //access the private object field 'obj'
  def printObj{
    println(s"I can see ${Foo2.obj}")
  }
}
object Foo2{
  private val obj = "Foo2's object"
}

object Driver2 extends App{
  val f = new Foo2
  f.printObj
}
