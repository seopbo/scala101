package main.scala.EX_9

/*
  사용자 입력과 Either 활용
  - 아래의 예시에서 Int 자료형으로 변경될 수 있을 때는 Right 자료형으로 반환
  - 그렇지 않은 경우에는 Left 자료형으로 반환함
*/

object EX_9_4 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("값을 입력하세요: ")
    val result: Either[String, Int] = try {
      Right(input.toInt)
    } catch {
      case e: Exception => Left(input)
    }
    println(result.getClass)
  }
}
