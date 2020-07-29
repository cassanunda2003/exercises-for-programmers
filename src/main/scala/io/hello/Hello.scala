package io.hello

class Hello {
  
    def sayName(name: String) = s"Hello, $name, nice to meet you!"

    def getName(): String = {
        print("What is your name: ")
        val name = scala.io.StdIn.readLine()
        name
    }
}

object HelloRunner extends App {
    val hello = new Hello()
    val name = hello.getName
    val greeting = hello.sayName(name)
    println(greeting)

    println(s"Hello, ${hello.getName()}, nice to meet you!")
}