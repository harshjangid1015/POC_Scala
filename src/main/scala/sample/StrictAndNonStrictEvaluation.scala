package sample

object StrictAndNonStrictEvaluation {
  def fun1() = {
    println("fun1")
    10
  }
  def fun2() = {
    println("fun2")
    20
  }

  //strict Evaluation
  def myIf(cond: Boolean, thenPart: Int, elsePart: Int) =
    if (cond) thenPart else elsePart

  //Non Strict Evaluation
  def myIf2(cond: Boolean, thenPart: => Int, elsePart: => Int) =
    if (cond) thenPart else elsePart

  def main(args: Array[String]): Unit = {
    println("Non Strict Evaluation")
    println(myIf((1 < 2), fun1(), fun2()))

    println("Non Strict Evaluation")
    println(myIf2((1<2), fun1(), fun2()))

  }

}
