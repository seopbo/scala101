package EX_7

/*
  자료형에서 자유로운 배열
*/

object EX_7_2 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(13, "hi", 1.42) // 자바랑 다르게 이게됨.
    for (x <- arrayA) println(x)
  }
}
