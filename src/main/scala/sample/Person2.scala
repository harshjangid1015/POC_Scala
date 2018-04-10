package sample
//demo of creating instance without "new" keyword
case class  Person2 (var name: String){

}

object Person2 extends App{
  val h = Person2("Harsh")
  val a = Array(Person2("Harsh"), Person2("Aarav"))

  println(h)
  println(a)
}
