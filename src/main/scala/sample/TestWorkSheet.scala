package sample

object TestWorkSheet {
  def main(args: Array[String])= {
    println("Welcome to scala worksheet")

    var i:Int =5
    println(i)

    val(v1, v2, v3, v4) = (10, 20, 30, 40)
    println(v1)

    println(2 + 3) //2 object calls + method

    def square(x:Int):Int = {
      x*x
    }
    var x:Int= 7
    val p = square(x)
    println(p)
  }

}
