package tipcalculator

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

class CalculatorSpec extends AnyFreeSpec with Matchers {
  
    val sut = new Calculator()

    "Tip Calculator must" - {
        "calculate the a 15% tip for 100 pounds" in {
            sut.calculateTip(100) mustBe 15.0
        }

        "Return 0 if amount is 0" in {
            sut.calculateTip(0) mustBe 0
        }

        "Return 0 if amount in less than 0" in {
            sut.calculateTip(-1) mustBe 0
        }

        "return 30 for 200 pounds" in {
            sut.calculateTip(200.00) mustBe 30
        }

        "Return the total due for 200 pounds" in {
            sut.totalAmount(200.00) mustBe 230.00
        }
    }
}
