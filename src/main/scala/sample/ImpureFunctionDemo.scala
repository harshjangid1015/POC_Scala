package sample

object ImpureFunctionDemo {
  var balance = 1000
  def withdraw(amount: Int) = {
    balance = balance - amount
    balance
  }

  def main(args: Array[String]): Unit = {
    println(withdraw(100))    //return 900
    println(withdraw(100))    //return 800
  }

}
