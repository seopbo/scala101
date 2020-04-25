package EX_7

/*
  맵을 활용한 학생 명부
*/

object EX_7_7 {
  def main(args: Array[String]): Unit = {
    var student1Ban = Map(
      1 -> "고지용",
      2 -> "김말자",
      3 -> "김말이",
      4 -> "김이불",
      5 -> "이재현",
      6 -> "정미쳐",
      7 -> "차수홍",
      8 -> "최에림",
      9 -> "최한잔"
    )

    student1Ban += (10 -> "전학생") // 전학생이 와서 추가합니다.
    student1Ban -= 9 // 9번 학생이 전학을 가서 뺍니다.

    // 사람들이 많이 전학을 와서 아예 2반을 만들어 버렸습니다.
    var student2Ban = Map(
      11 -> "고세융",
      12 -> "권육삼",
      13 -> "김융찬",
      14 -> "김참치"
    )

    // 반을 나누는 건 비효율적이라고 생각해 반을 합쳤습니다.
    var students = student1Ban ++ student2Ban

    students.foreach(i => print(i))
    // for 형태의 루프도 가능하고,
    // foreach를 지원하는 컬렉션이라면 이렇게도 표현 가능합니다.

    println()
    // 선생님이 갑자기 5번을 발표하라고 부릅니다.
    val callee = 5
    println("여기 " + callee + "번 없어?")

    // 5번이 반에 있는 지 확인합니다.
    println(students.contains(5))
  }
}
