package scala.EX_8

/*
  flatten() 메소드
*/

object EX_8_8 {
  def main(args: Array[String]): Unit = {
    val o = List(List(1, 2, 3, 4), List(5, 6))
    val n = o.flatten
    println(n)
  }
}
