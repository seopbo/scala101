package EX_3

object EX_3_10 {
  def main (args: Array[String]): Unit = {
    val x = List('a','b','c')
    for ((char, index) <- x.zipWithIndex) {
      println(index, char)
    }
  }
}
