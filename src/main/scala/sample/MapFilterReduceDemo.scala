package sample

object MapFilterReduceDemo {
  def main(args: Array[String]): Unit = {
    val a = List(1,2,3,4,5,6,7)

    val b = a.map(x => x * x)
    //returns another list with same element count
    val c = a.filter(x => x < 5)
    //returns another list but element count might vary
    val d = a.reduce((x, y)=>x+y) //returns an aggregated value but not the list
    println(b)
    println(c)
    println(d)
  }
}
