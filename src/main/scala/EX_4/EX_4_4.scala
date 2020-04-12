package EX_4

/*
  상속
 */

object EX_4_4 {
  def main (args: Array[String]): Unit = {
    val richUser = new PaidUser("고말자", 20, 'M', 10000)
    richUser.sayName
    richUser.showMoney
  }
}

class User (name: String, age: Int, sex: Char) {
  val sayName = println("제 이름은" + name) // Scala에서는 함수도 객체이므로 이 것이 가능!
}

class PaidUser (name: String, age: Int, sex: Char, money: Int) extends User (name, age, sex) {
  val showMoney = println(money + "원이 있습니다.")
}