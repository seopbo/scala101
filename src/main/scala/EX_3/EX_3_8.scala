package EX_3

object EX_3_8 {
  def main (args: Array[String]) = {
    for (x <- 1 until 5 ; y <- 1 until 5)
      println(x + " * " + y + " = " + x * y)
  }
}
