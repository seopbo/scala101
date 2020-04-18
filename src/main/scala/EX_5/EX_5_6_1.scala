package EX_5

/*
  val 변수에 함수 넣기
  - f를 부분 적용 함수 형태로 바꾸어 변수에 저장
*/

object EX_5_6_1 {
  def main(args: Array[String]): Unit = {
    val g = f _
    println(g(1))
  }

  def f(i: Int) = i
}
