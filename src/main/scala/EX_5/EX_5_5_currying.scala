package EX_5

/*
  커링을 이용한 부분 적용 함수
*/

object EX_5_5_currying {
  def main(args: Array[String]): Unit = {
    val thisYear = 2016

    val fixedValueFunction = go(thisYear)(_)
    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")
  }

  def go(thisYear: Int)(string: String): Unit = {
    println(string + ":" + thisYear)
  }
}
