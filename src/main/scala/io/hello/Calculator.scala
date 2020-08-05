package io.hello

object Calculator extends App {
    
    print("What is the first number? ")
    val first = scala.io.StdIn.readInt()
    if(first < 0) 
        throw new Exception("Number cannot be negative")
    else{
        print("What is the second number? ")
        val second = scala.io.StdIn.readInt()
        if(second < 0)
            throw new Exception("Number cannot be less than zero")
        else
        {
            
                val sum = first + second
                val subraction = first - second
                val product = first * second
                val division = first / second

                println(s"$first + $second = $sum")
                println(s"$first - $second = $subraction")
                println(s"$first * $second = $product")
                println(s"$first / $second = $division")

        }
    }



}
