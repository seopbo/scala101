package EX_4

/*
  케이스 클래스의 편리함
*/

object EX_4_3 {
  def main(args: Array[String]): Unit = {
    val apple = Fruit2("사과") // 케이스 클래스는 new 예약어를 생략 가능하다.
    println(apple.name)
  }
}

case class Fruit2(name: String)
