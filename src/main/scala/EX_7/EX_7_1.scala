package EX_7

/*
  간단한 Int형 배열과 String형 배열
*/

object EX_7_1 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(1, 2, 3, 4, 5)
    for (x <- arrayA) println(x)

    val arrayB = Array("a", "b", "c", "d")
    for (x <- arrayB) println(x)
  }
}
