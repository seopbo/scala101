package EX_7

/*
  맵의 선언 및 활용
  - 변수 선언 시, 자료형을 명시적으로 쓰지않으면 제네릭하게 사용할 수 있음.
  - Map 객체의 apply가 키에 따라 값을 꺼내오는 함수로 지정되어 있음 (없는 키를 넣으면 에러)
  - 위 대신 get 메소드를 활용할 수도 있음 (없는 키를 넣으면 None을 반환)
*/

object EX_7_6 {
  def main(args: Array[String]): Unit = {
    var map = Map(
      "number1" -> "aa",
      "number2" -> "bb",
      "number3" -> 3,
      5 -> "cc"
    )

    println(map.isEmpty)
    println("whole map : " + map)
    println("keys : " + map.keys)
    println("values : " + map.values)
    println(map("number1"))
    println(map.get("number2"))
    println(map.get("number4"))

    map += ("number4" -> "this is the fourth value")
    map -= "number4"

    for (key <- map.keys) println(key)
  }
}
