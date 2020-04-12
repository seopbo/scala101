package EX_5

/*
  드랍십에 사람을 태우는 코드 (CALL-BY-NAME)
*/

object EX_5_3 {
  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int): Int = {
    println("탑승수속을 시작합니다.")
    n
  }

  def dropship(n: Int): Unit = {
    println("드랍십 준비합니다.")
    println(n + "명 탑승했습니다.")
  }
}
