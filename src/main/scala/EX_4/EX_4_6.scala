package EX_4

/*
  트레이트를 상속받아 구현하는 메소드 (스칼라의 트레이트를 자바의 인터페이스처럼 사용하는 경우)
 */

object EX_4_6 {
  def main(args: Array[String]): Unit = {
    val pig = new Animal2
    pig.eat
  }
}

class Animal2 extends Eating {
  def eat = println("먹습니다. 쩝쩝~")
}

trait Eating {
  def eat
}