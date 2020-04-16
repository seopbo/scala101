package EX_5

/*
  apply() 메소드 이용하기
  - apply() 메소드를 이용하면 생성자처럼 초기화하거나 클래스 안에 특정한 메소드를 기본 메소드로 지정할 수 있다.
*/

object EX_5_10 {
  class SomeClass {
    def apply(m: Int) = method(m)
    def method(i: Int) = i + i
    def method2(s: String) = s
  }

  def main(args: Array[String]): Unit = {
    val someting = new SomeClass
    println(someting(2))
  }
}
