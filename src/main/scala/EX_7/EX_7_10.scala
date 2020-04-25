package EX_7

/*
  Iterator의 선언과 활용
*/

object EX_7_10 {
  def main(args: Array[String]): Unit = {
    val list = List("a", "b", "c")
    val i = list.iterator

    while (i.hasNext) println(i.next)
  }
}
