package sample
// multiple constructor with additional apply method
class Person3 {
  var name = ""
  var age = 0
//  var name: String =_   // _ sets null value for name
}
object Person3{
  //an one-arg construcor
  def apply(name: String): Person3 = {
    var p = new Person3
    p.name = name
    p
  }

  //a two-arg constructor
  def apply(name: String, age:Int): Person3 = {
    var p = new Person3
    p.name = name
    p.age = age
    p
  }
}
object Driver3 extends App{
  val harsh = Person3("Harsh")
  val Harry = Person3("Harry", 30)

  println(harsh)    // can see that it created object
  println(Harry)
}
// all this can be don using case class in fewer steps