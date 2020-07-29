package tipcalculator

object TipRunner extends App {
    val calc = new Calculator()

    println("Enter the amount due:")
    val amnt = scala.io.StdIn.readDouble()
    println("Enter the tip:")
    val tip = scala.io.StdIn.readInt()
    println(s"The total amount due is ${calc.totalAmount(amnt, calc.convertTipToPercentage(tip))}")

}
