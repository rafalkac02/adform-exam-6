import FileReader._
import org.scalatest._
import flatspec._
import matchers._

class FileReaderSpec extends AnyFlatSpec with should.Matchers {

  def roundTwo(x: Double) = BigDecimal(x).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

  behavior of "transform()"
  it should "return transformed values according to minimum and maximum values" in {
    val min = 100.0
    val max = 10000.0

    transform(100.0, min, max) shouldBe -1.0
    roundTwo(transform(1000.0, min, max)) shouldBe -0.82
    roundTwo(transform(2000.0, min, max)) shouldBe -0.62

  }
}