package io.hello

class Quotes {


val quoteData = Map(
    "Obi Wan Kenobi" -> "These arent the droids you are looking for",
    "Hamlet" -> "To be or not to be that is the question"
)

  def quote() {
      print("What is the quote?")
      val quotes = scala.io.StdIn.readLine()
      print("Who said it?")
      val person = scala.io.StdIn.readLine()
      println(person + " says, \"" + quotes + "\".")
  }
}

object QuoteRunner extends App {
    val q = new Quotes()
    //q.quote()

    for(key <- q.quoteData.keys){
        println(key + " says, \"" + q.quoteData.get(key).getOrElse("") +"\".")
    }
}
