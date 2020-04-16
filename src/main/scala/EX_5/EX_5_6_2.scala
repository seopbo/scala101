package EX_5

/*
  val 변수에 함수 넣기
  - 반환 자료형을 명시적으로 쓰는 경우
*/

object EX_5_6_2 {
  def main(args: Array[String]): Unit = {
    val g: (Int => Int) = f
    println(f(1))
  }

  def f(i: Int) = i
}
