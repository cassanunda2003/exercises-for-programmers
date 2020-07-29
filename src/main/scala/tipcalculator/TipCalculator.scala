package tipcalculator

trait TipCalculator {

  final val defaultTip = 0.15

  def calculateTip(amount: Double, percentageOfTip: Double = defaultTip): Double

  def totalAmount(amount: Double, percentageOfTip: Double = defaultTip): Double
}

class Calculator extends TipCalculator {
    override def calculateTip(amount: Double, percentageOfTip: Double): Double = {
        if (amount >= 0)
            amount * percentageOfTip
        else 0.0
    }

    override def totalAmount(amount: Double, percentageOfTip: Double = defaultTip): Double 
    = roundAt(2)(amount + calculateTip(amount))

    //https://stackoverflow.com/questions/11106886/scala-doubles-and-precision
    private def roundAt(p: Int)(n: Double): Double = 
     { val s = math pow (10, p); (math round n * s) / s }
}
