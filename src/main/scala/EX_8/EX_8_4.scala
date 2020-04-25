package scala.EX_8

/*
  partition 메소드
*/

object EX_8_4 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.partition(i => i > 3)
    println(n)
  }
}
