package scala.EX_8

/*
  foldLeft() 메소드
*/

object EX_8_3 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.foldLeft(0)((i, j) => i + j)
    println(n)
  }
}
