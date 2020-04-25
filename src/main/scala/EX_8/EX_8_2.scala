package scala.EX_8

/*
  filter() 메소드
  - List와 같이 썻으므로
    filter(p: (A) => Boolean): List[A]
*/

object EX_8_2 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.filter(i => i >= 3).map(i => i * 2)
    println(n)
  }
}
