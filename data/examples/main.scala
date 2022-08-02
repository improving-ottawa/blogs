object MainProgram {

  final def main(args: Array[String]): Unit = {
    val resultCode = runMain(args)
    if (resultCode != 0) {
      System.exit(resultCode)
    }
  }

  def runMain(args: Array[String]): Int = {
    ???
  }
}
