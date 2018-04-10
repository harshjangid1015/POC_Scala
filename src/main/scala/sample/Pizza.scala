package sample
// primar constructor
class Pizza (var crustSize: Int, var crustType:String){
  // one-arg auxilary consructor
  def this(crustSize: Int){
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }
  // one-arg auxilary consructor
  def this(crustType:String){
    this(Pizza.DEFAULT_CRUST_SIZE, crustType)
  }

  // zero-arg auxilary consructor
  def this(){
    this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  }

  override def toString = s"A $crustSize inch pizza with a $crustType crust"

}
object Pizza{
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "THIN"

  def main(args: Array[String]): Unit = {
    val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
    val p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
    val p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
    val p4 = new Pizza()

    println(p1)
    println(p2)
    println(p3)
    println(p4)


  }
}
