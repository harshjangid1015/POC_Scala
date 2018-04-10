package sample
// case classes can be pattern matched
case class Person4(var name: String) {
  var a = Person4("Harsh")
  var b = Person4("Jangid")

  def fun(p:Person4) = p match {
    case Person4("Harsh") => println("Harsh")
    case Person4("Jangid") => println("Jangid")
    case _ => println("default")
  }
  val f = fun(a)
}

