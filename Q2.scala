import scala.io.StdIn

object patternMatching {
  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = StdIn.readInt()

    if (input <= 0) {
      println("Negative/Zero is given")
    } else if (input % 2 == 0) {
      println("Even number is given")
    } else {
      println("Odd number is given")
    }
  }
}
