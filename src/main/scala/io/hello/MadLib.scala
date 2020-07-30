package io.hello

object MadLib extends App {
  print("Enter a noun: ")
  val noun = scala.io.StdIn.readLine()
  print("Enter a verb: ")
  val verb = scala.io.StdIn.readLine()
  print("Enter an adjective: ")
  val adjective = scala.io.StdIn.readLine()
  print("Enter an adverb: ")
  val adverb = scala.io.StdIn.readLine()

  println(s"Do you $verb your $adjective $noun $adverb, That's hilarious!")
}
