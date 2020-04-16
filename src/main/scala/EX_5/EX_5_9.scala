package EX_5

/*
  매개변수에 기본값을 설정
*/

object EX_5_9 {
  def main(args: Array[String]): Unit = {
    println("기본값은 " + default())
  }

  def default(a: Int = 4, b: Int = 5): Int = a + b
}
