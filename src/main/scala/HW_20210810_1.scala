object HW_20210810_1 {
  def main(args: Array[String]): Unit = {
    def trianglePascal(a: Int, b: Int): Int = {
      try {
        if (a>b) throw new RuntimeException("Строка должна быть меньше столбца")
        else (
          if (a == 0 || a == b ) 1 else {
            trianglePascal(a - 1, b - 1) + trianglePascal(a , b - 1)
          })
      } catch {
        case ex: RuntimeException => throw ex
      }
    }
    val res = trianglePascal(10, 15)
    println(res)
  }
}
