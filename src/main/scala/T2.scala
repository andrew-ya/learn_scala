object T2 {

  case class Complex(re: Double, im: Double) {

    def add(other: Complex): Complex = {
      Complex(this.re + other.re, this.im + other.im)
    }


    def +(other: Complex): Complex = {
      this.add(other)
    }

  }


  def main(args: Array[String]): Unit = {
    println(Complex(1,1) + Complex(2,2))
    println(Complex(1,1).add(Complex(2,2)))



    val cel = (20.2, "celcius")
    val cez = (20.2, "dsfnwdifu")


    def trans(grad: (Double, String)): (Double, String) = {
      if (grad._2 == "celcius") {
        (grad._1 * 1.8 + 32, "fahrengeit")
      } else {
        ((grad._1 - 32)/1.8, "celcius")
      }
    }


    trait Figure {
      def square: Double
    }


    case class Square(a: Double, b: Double) extends Figure {
      override def square: Double = a * b
    }

    case class Circle(r: Double) extends Figure {
      override def square: Double = r * 2 * 3.14
    }


    val f1 = Square(2, 2)
    val f2 = Circle(5)


    println(f1.square)
    println(f2.square)



    case class Trans(c: Double, f: Double)  {
      def far: Double = {c * 1.8 + 32}
      def cel: Double = {(f - 32)/1.8}
    }
    val res = Trans(36, 0)

    println(s"Фаренгейт: " + res.far + ", Цельсий: " + res.cel)



    trait Grad
    case class Celcius(value: Double) extends Grad
    case class Fahrengeit(value: Double) extends Grad



    def celc2far(celcius: Celcius): Fahrengeit = {
      Fahrengeit(celcius.value * 1.8 + 32)
    }

    def trans2(grad: Grad): Grad = {
      grad match {
        case Celcius(value) => Fahrengeit(value * 1.8 + 32)
        case Fahrengeit(value) => Celcius((value - 32)/1.8)
      }
    }

    println(trans2(Celcius(36)))

//    "sdsd" match {
//      case  "sdsd" => println(true)
//      case  "aasd" => println(false)
//      case 12 => println(false)
//      case _ =>
//    }


//    n! = 1 * 2 * 3 ... * n


    def fac(n: Int): Int = n match {

      case 1 => n
      case other => other * fac(other - 1)

    }

    println(fac(3))


    fac(3)
      3 * fac(2)
        3 * 2 * fac(1)
          3 * 2 * 1


  }








}
