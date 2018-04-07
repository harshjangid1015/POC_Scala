package sample

object ClosuresDemo {

  def fun1():Int => Int = {
    val y = 1
    def add(x: Int) = x + y
    println(add(10))
    add
  }

  def fun2() = {
    val y = 2
    val f = fun1()
    println(f(10)) // what does it print? 11 or 12
  }

  var votingAge = 18
  val isOfVotingAge = (age: Int) => age >= votingAge

  var more = 1
  val addMore = (x: Int) => x + more

  val a = List(95, 87, 20, 45, 35, 66, 10, 15)
  def removeLowScores(a: List[Int], threshold: Int): List[Int] =
    a.filter(score => score >= threshold)
    /*The anonymous function "score => score >= threshold" is the closure here.*/
  def main(args: Array[String]): Unit = {
    fun2()

    println(isOfVotingAge(16)) // false
    println(isOfVotingAge(20)) // true

    println(addMore(10))  //11
    more = 9999
    println(addMore(10))  //10009

    println(removeLowScores(a, 30))
  }

}
/*”add” function gets executed with the environment it had when it was defined*/