package io.hello

class NumberOfChars {
  
    def getString() = {
        print("What is the input string?")
        scala.io.StdIn.readLine()
    }

    def outPutChars(input: String) = {
        s"$input has ${input.length()} characters."
    }
}

object CharLengthRunner extends App  {
    val nchars = new NumberOfChars()
    println(nchars.outPutChars(nchars.getString()))
}
