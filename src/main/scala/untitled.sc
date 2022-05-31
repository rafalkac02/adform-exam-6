import scala.io.Source.fromFile


val inputPath = "C:\\academy-projects\\ex-6\\input.csv"




val min: Double = 0
val max: Double = 100
def transform(x: Double): Double = ((x - min) * 2 / max - min) - 1
transform(50)
transform(0)
transform(100)
transform(25)
transform(10)


fromFile(inputPath)
  .getLines
  .toSeq
  .foldLeft(Seq.empty[Int]) { (res, x) =>
    res ++ x
  }
