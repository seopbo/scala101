package EX_3

/*
  조건이 있는 반복문
*/

object EX_3_9 {
  def main(args: Array[String]) = {
    for (i <- (1 to 10) if (i % 2 == 0))
      println(i)
  }
}
