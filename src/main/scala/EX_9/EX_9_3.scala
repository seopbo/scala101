package main.scala.EX_9

/*
  사용자 입력
*/

object EX_9_3 {
  def main(args: Array[String]): Unit = {
    print("값을 입력하세요: ")
    var a = scala.io.StdIn.readLine
    println("입력하신 값은 " + a + "입니다.")
  }
}
