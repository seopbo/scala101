package EX_3

/*
  until을 이용한 for 루프
*/

object EX_3_4 {
  def main(args: Array[String]): Unit = {
    for (x <- 1 until 10)
      println("x의 값은" + x)
  }
}
