package EX_4

/*
  일반적인 스칼라의 생성법
 */

object EX_4_2 {
  def main (args: Array[String]): Unit = {
    val apple = new Fruit("사과")
    println(apple.name)
  }
}

class Fruit (input: String) {
  var name = input // public
}