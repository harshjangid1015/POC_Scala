package sample

object DoWhileLoop {
  def main ( args : Array[String]) {
    // Local variable declaration:
    var a = 10
    // do while loop execution
    do {
      println ( "Value of a: " + a )
      a = a + 1
    } while( a < 20 )
  }
}
