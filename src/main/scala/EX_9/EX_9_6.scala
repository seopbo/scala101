package scala.EX_9

/*
  동반 객체
*/

object EX_9_6 {
  object Companion {
    private def ma = {}
    def mb = {}
  }

  class Companion {
    val a = Companion.ma // 정상
    val b = Companion.mb // 정상
  }

  def main(args: Array[String]): Unit = {
    println(Companion.mb)
  }
}
