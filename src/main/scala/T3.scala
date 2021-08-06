import scala.util.{Failure, Success, Try}

object T3 {

  class Salary(val value: Int)

  def main(args: Array[String]): Unit = {


    val p1 = try {
      throw new RuntimeException("error here!")
    } catch {
      case ex: RuntimeException => println(ex.getMessage)
//      case _: Throwable => println("Throwable")
    }


    def divide(a: Int, b: Int): Int = {
      try {
        a / b
      } catch {
        case ex: ArithmeticException => throw ex
      }
    }


    println("I'm working...")

    val p2 = Try(1 / 0)
    println("Try result... " + p2 )


    val p3 = Try(10 / 2)
    println("Try result... " + p3 )


    p2 match {
      case Success(value) => println("result is: " + value )
      case Failure(exception) => println("error is: " + exception.getMessage)
    }


    val mayBeInt: Option[Int] = Some(5)
    val mayBeInt2: Option[Int] = None


    def multiplyBy2(i: Option[Salary]): Option[Int] = {
      i.map(sal => sal.value * 2).filter(sal => sal > 100)
    }

    val s1: Option[Salary] = Option(null)
    val s2: Option[Salary] = Option(new Salary(100500))
    val s3: Option[Salary] = Option(new Salary(20))

    println(multiplyBy2(s1))
    println(multiplyBy2(s2))
    println(multiplyBy2(s3))


    val res1: Option[Int] = s3.flatMap(sal3 => s2.map(sal2 => sal2.value + sal3.value))


    val result = for {
//      v0 <- s1
      v1 <- s2
      v2 <- s3
    } yield    v1.value + v2.value


    println(result.getOrElse(0))

  }

}
