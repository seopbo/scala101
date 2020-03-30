object EX_2_3 {
  type Name = String
  type Person = (String, Int)
  type FType = String => Int

  def main(args: Array[String]): Unit = {


    val name: Name = "임말자"
    println(name)
    val person: Person = ("김동옥", 24)
    println(person)
    val f: FType = text => text.toInt // text라는 이름의 parameter를 받는 function
    println(f("1"))
  }
}
