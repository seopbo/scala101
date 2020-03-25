object C01_Basics {
  def main(args: Array[String]): Unit = {
    /*
      표현식은 연산 가능한 명령문이다.
     */
    println(1)
    println(1 + 1)
    println("Hello!")
    println("Hello," + " world!")

    /*
      값 val 키워드로 표현식의 결과에 이름을 붙인다.
     */

    val x = 1 + 1
    println(x)
  }
}
