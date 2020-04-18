package EX_6

/*
  객체 패턴 매칭 코드
  - _ 와일드 카드를 사용해서 객체 패턴 매칭 시 변수 두 개만 고려하는 경우
*/

object EX_6_2_1 {
  case class Person(name: String, age: Int, rank: String)

  def main(args: Array[String]): Unit = {
    val person1 = Person("이멋남", 47, "부회장")
    val person2 = Person("김쾌남", 73, "회장")
    val person3 = Person("김솔로", 27, "사원")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
  }

  def matchAndHi(person: Person): Unit = person match {
    case Person("이멋남", 47, "부회장") => println("부회장님 오셨습니다.")
    case Person("김쾌남", 73, "회장") => println("회장님 오셨습니다.")
    case Person("김솔로", 27, _) => println("어 솔로 왔니?")
    case _ => println("매치되는 결과가 없습니다.") // 일치하는 결과가 없을 때의 처리
  }
}
