package EX_8

/*
  map(), foreach() 메소드
  - map()은 값을 리턴, List에 쓰였으므로
  - foreach()는 값을 리턴하지 않음.
*/

object EX_8_1 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.map(i => i * 10)
    println(n, o)

    val m = o.map(_ * 10)
    println(m, o)

    val k = o.foreach(i => i + 10)
    println(k, o)
  }
}
