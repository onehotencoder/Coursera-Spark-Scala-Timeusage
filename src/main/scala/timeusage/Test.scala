package timeusage

object Test {
  def main(args: Array[String]): Unit = {
    val columnNames: List[String] = List("t01", "t03", "t11", "t1801", "t1803", "t1", "t2")
    val primaryNeedsCols: List[String] = List("t01", "t03", "t11", "t1801", "t1803")
    println(columnNames.filter(col => primaryNeedsCols.exists(c => col.startsWith(c))))
  }
}
