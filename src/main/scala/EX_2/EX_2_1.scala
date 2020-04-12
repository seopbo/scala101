package EX_2

/*
  final 속성을 가진 val 변수
*/

object EX_2_1 {
  def main(args: Array[String]): Unit = {
    var a = "변수입니다."
    val b = "final 변수입니다."
    a = "바꿀 수 있을까요?"
//    b = "바꿀 수 있을까요?"
    println(a)
  }
}
