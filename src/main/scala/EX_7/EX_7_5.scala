package EX_7

/*
  리스트 기능
*/

object EX_7_5 {
  def main(args: Array[String]): Unit = {
    val list3 = "a" :: "b" :: "c" :: Nil
    val list4 = 1 :: 2 :: 3 :: Nil
    val list5 = 2 :: 2 :: 4 :: Nil

    println(list3 ++ list4)
    println(list3.apply(0))
    println(list3.reverse) // 실행 후에도 list3는 바뀌지 않음.
    println(list4.max)
    println(list4.min)
    println(list4.sum)
    println(list4.mkString(","))
    println(list4.exists(a => a > 3)) // 3보다 큰 요소가 있는 가?
    println(list4.exists(_ > 3)) // 위 행과 같은 표현
    println(list4.contains(1))
    println(list4.isEmpty)
    println(list5.distinct)
  }
}
