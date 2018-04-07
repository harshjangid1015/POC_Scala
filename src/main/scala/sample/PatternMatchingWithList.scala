package sample

object PatternMatchingWithList {
  def fun(a: List[Int]) = a match {
    case List(0, p, q) => p + q
    case List() => -1
    case _ => -1
  }


  def length(a: List[Int]):Int = a match {
    case Nil => 0
    case h::t => 1 + length(t)  //first element head,rest is tail
  }

  def main(args: Array[String]): Unit = {
    println(fun(List(0, 10, 20)))   //return 30
    println(fun(List(0, 1, 2, 3)))  //-1
    println(fun(List(1, 10, 20)))   //-1
    println(fun(List()))            //-1

    println(length(List()))               //0
    println(length(List(10,20,30,40)))    //4
  }
}
