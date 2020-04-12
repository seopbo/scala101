package EX_4

/*
  스칼라에서의 클래스 생성 및 인스턴스화
*/

object EX_4_1 {
  def main(args: Array[String]): Unit = {
    val car = new Vehicle()
    println(car.price)
    println(car.hood)
  }
}

class Vehicle() {
  val price: Int = 100000 // public
  var hood: String = "expensive hood" // public
}