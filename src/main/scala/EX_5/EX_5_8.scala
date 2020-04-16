package EX_5

/*
  매개변수가 여러개인 함수
*/

object EX_5_8 {
  def main(args: Array[String]): Unit = {
    printlnStrings("string1", "string2", "string3")
  }

  def printlnStrings(args: String*): Unit = {
    for (arg <- args) {
      println(arg);
    }
  }
}
