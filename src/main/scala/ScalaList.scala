object ScalaList {
  def main(args: Array[String]): Unit = {
    // 创建字符串List
    val list = List("1", "2", "3")
    // 把字符串List转化为整数List
    val intList = list.map(s => s.toInt)
    // 打印
    print(intList)
  }
}