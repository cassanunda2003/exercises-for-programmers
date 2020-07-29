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

    override def totalAmount(amount: Double, percentageOfTip: Double = defaultTip): Double = amount + calculateTip(amount)

}
