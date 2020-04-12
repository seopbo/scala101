package EX_5

/*
  반환 자료형을 명시적으로 선언하지 않은 함수.
*/

object EX_5_1 {
  def main(args: Array[String]): Unit = {
    println("반환 받은 값 : " + name())
  }

  def name() = {
    val a = 10
    a
  }
}
