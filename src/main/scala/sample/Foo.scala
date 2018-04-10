package sample

class Foo {
  private val secret = 2
}
object Foo{
  //acces the private class field 'secret'
  def double(foo: Foo)=
    foo.secret*2
}

object Driver extends App {
  val f = new Foo
  println("Double value is "+Foo.double(f))    //prints 4
}
