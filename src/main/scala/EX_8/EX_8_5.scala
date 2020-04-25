package scala.EX_8

/*
  zip, unzip, :::의 차이
*/

object EX_8_5 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val oo = List(5, 6, 7, 8)

    val n = o.zip(oo)
    val nn = n.unzip
    val nnn = o ::: oo

    println(n)
    println(nn)
    println(nnn)
  }
}
