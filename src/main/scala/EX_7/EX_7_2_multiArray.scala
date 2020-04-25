package EX_7

/*
  다차원 배열
*/

object EX_7_2_multiArray {
  def main(args: Array[String]): Unit = {
    val matrixA = Array(Array(1, 2), Array(3, 4))
    for (i <- 0 to 1 ; j <- 0 to 1) println(matrixA(i)(j))

    val matrixB = Array.ofDim[Int](2, 2)
    var cnt = 1
    for (i <- 0 to 1 ; j <- 0 to 1) {
      matrixB(i)(j) = cnt
      cnt+=1
    }
    for (i <- 0 to 1 ; j <- 0 to 1) println(matrixB(i)(j))
  }
}
