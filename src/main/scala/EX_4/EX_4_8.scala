package EX_4

/*
  추상 클래스와 트레이트를 상속받아 구현하는 클래스
  - 가장 뒤의 trait의 method가 모든 것을 override 하는 경우
*/

object EX_4_8 {
  def main(args: Array[String]): Unit = {
    val robot = new Mazinga
    println(robot.shoot)
  }
}

class Mazinga extends Robot with M16 with Bazooka with Daepodong
abstract class Robot {
  def shoot = "뿅뿅"
}

trait M16 extends Robot {
  override def shoot = "빵야"
}

trait Bazooka extends Robot {
  override def shoot = "뿌왕뿌왕"
}

trait Daepodong extends Robot {
  override def shoot = "콰르르르릉"
}