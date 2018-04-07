package sample

object CaseStatement {
  def main(args: Array[String]) = {

    def errorMsg(errorCode: Int) = errorCode match {
      case 1 => "File not found"
      case 2 => "Permission denied"
      case 3 => "Invalid operation"
      case _ => "Default Value"
    }

    println(errorMsg(2))

  }
}
