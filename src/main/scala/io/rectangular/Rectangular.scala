package io.rectangular

case class AreaInput(length: Double, width: Double, units: String)

object Rectangular extends App {

    final val conversionFactor = 0.09290304

    def askForInput(): AreaInput = {
        print("What is the length of the romm in feet? ")
        val length = scala.io.StdIn.readDouble()
        print("What is the width of the room in feet? ")
        val width = scala.io.StdIn.readDouble()
        print("Do you want to enter feet (f) or meters (m)")
        val units = scala.io.StdIn.readLine()
        AreaInput(length, width, units)
    }

    def workOutArea(inputs: AreaInput): (Double, Double) = {
        val area = inputs.length * inputs.width
        inputs.units match {
            case "m" => 
                (area, area/conversionFactor)
            case "f" => 
                (area * conversionFactor, area)
        }
    }

    val areai = askForInput()
    println(s"You entered dimensions of ${areai.length} by ${areai.width}")
    val areas = workOutArea(areai)

    println(s"The area in feet is ${areas._2}")
    println(s"The area in meters is ${areas._1}")
}