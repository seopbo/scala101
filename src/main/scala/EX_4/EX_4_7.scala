package EX_4

/*
  추상 클래스와 트레이트를 상속받아 구현하는 메소드 (믹스인)
 */

object EX_4_7 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig
    pig.eat
    pig.shout
    pig.fly
  }
}

class Pig extends Animal3 with Flying with Eating {
  def shout = println("꿀꿀")
  def eat = println("쩝쩝")
}

abstract class Animal3 {
  def shout
}
