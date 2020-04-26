package main.scala.EX_9

/*
  변경불가능하게 컬렉션 이용하기
*/

object EX_9_1 {
  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 40, 55)

    def foreach(list: List[Int]) = {
      def add(list: List[Int], total: Int): Int = {
        list match {
          case List() => total
          case List(item) => total + item
          case head :: tail => add(tail, total + head) // head는 맨 최근의 하나의 element, tail은 나머지 List
        }
      }
      add(list, 0)
    }
    println(foreach(list))
  }
}
