package EX_5

/*
  간단한 덧셈을 하는 함
*/

object EX_5_2 {
  def main(args: Array[String]): Unit = {
    val result = sum(1,2)
    println(result)
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }
  // def sum(a: Int, b: Int): Int = a + b처럼 한 줄로도 표현 가능함.
}
