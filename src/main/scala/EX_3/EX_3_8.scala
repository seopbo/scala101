package EX_3

/*
  스칼라식 이중 for 문
*/

object EX_3_8 {
  def main (args: Array[String]) = {
    for (x <- 1 until 5 ; y <- 1 until 5)
      println(x + " * " + y + " = " + x * y)
  }
}
