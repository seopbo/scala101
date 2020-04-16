package EX_5

/*
  implicit 예약어를 활용
  - 반환자료형과 매개변수로 알아서 함수를 판단하여 사용함
*/

object EX_5_11 {
  implicit def doubleToInt(d: Double) = d.toInt

  def main(args: Array[String]): Unit = {
    val x: Int = 18.0
    print(x)
  }
}
