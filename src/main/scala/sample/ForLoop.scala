package sample

object ForLoop {
  def main(args: Array[String]) {
    // Local variable declaration:
    var a = 0
    // while loop execution
    for( b <- 1 to 10 ){
      println( "Value of a: " + a )
      a = a + 1
    }

//    For Loop With Multiple Counters
    for (i <- 1 to 2; j <- 1 to 2){
      println(s"i = $i, j = $j")
    }
  }
}
