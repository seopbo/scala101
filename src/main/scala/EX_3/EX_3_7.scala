package EX_3

object EX_3_7 {
  def main (args: Array[String]) ={
    for (x <- 1 until 5) {
      for (y <- 1 until 5) {
        println(x + " * " + y + " = " + x * y)
      }
    }
  }
}
