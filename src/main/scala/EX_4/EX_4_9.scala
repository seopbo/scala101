package EX_4

/*
  추상 클래스와 트레이트를 상속받아 구현하는 메소드
  - super 이용하여 여러가지 기능을 순차적으로 실행시키는 경우
*/
object EX_4_9 {
  def main(args: Array[String]): Unit = {
    val robot = new SuperMazinga
    println(robot.shoot)
  }
}

class SuperMazinga extends AnotherRobot with AnotherM16 with AnotherBazooka with AnotherDaepodong

abstract class AnotherRobot {
  def shoot = "뿅뿅"
}

trait AnotherM16 extends AnotherRobot {
  override def shoot = super.shoot + "빵야"
}

trait AnotherBazooka extends AnotherRobot {
  override def shoot = super.shoot + "뿌왕뿌왕"
}

trait AnotherDaepodong extends AnotherRobot {
  override def shoot = super.shoot + "콰르르르"
}