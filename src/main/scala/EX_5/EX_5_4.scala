package EX_5

/*
  => 형식의 함수를 이용하는 코드 (CALL-BY-NAME)
  - 바깥에 있는 함수를 먼저 실행했다가 매개변수가 필요할 때 안에 있는 함수를 사용할 수 있다.
*/

object EX_5_4 {
  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int): Int = {
    println("탑승수속을 시작합니다.")
    n
  }

  def dropship(n: => Int): Unit = {
    println("드랍십 준비합니다.")
    println(n + "명 탑승했습니다.")
  }
}
