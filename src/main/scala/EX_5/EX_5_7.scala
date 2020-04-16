package EX_5

/*
  간단한 재귀함수를 이용해 계산하는 함수식
*/
object EX_5_7 {
  def main(args: Array[String]): Unit = {
    val result = calc(x => x * x, 2, 5)
    println(result)
  }

  def calc(f: Int => Int, start:Int, end: Int) = {
    // 합계를 구하는 재귀함수
    def loop(index: Int, sum: Int): Int = {
      if (index > end) sum
      else loop(index + 1, f(index) + sum)
    }

    loop(start, 0)
  }
}
