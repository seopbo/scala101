package EX_5

/*
  val 변수에 함수 넣기
  - 메소드 정의시 =>를 이용
*/

object EX_5_6_3 {
  def main(args: Array[String]): Unit = {
    val g = f
    println(g(1))
  }

  def f = (i: Int) => i
}
