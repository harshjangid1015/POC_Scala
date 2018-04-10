package sample

object Hello extends App {
  if (args.length ==1)
    println(s"Hello, ${args(0)}")
  else
    println("I didn't get your name")
}
