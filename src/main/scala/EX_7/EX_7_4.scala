package EX_7

/*
  연산자를 이용한 리스트 병합
*/

object EX_7_4 {
  def main(args: Array[String]): Unit = {
    val list1 = "a" :: "b" :: "c" :: Nil
    val list2 = "d" :: "e" :: Nil
    val list0 = list1 ::: list2 // list1.concat(list2)
    for (x <- 0 until list0.size) println(list0(x))
  }
}
