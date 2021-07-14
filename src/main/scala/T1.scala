
object T1 {


  def main(args: Array[String]): Unit = {


    val a: Int = 5

    val b: Double = 2.34

    val c: Char = 'a'

    val str: String = "assdadfs"

//
//    val l = println("aaaa")
//
//    println("l is " + l)

    val unitType: Unit = ()
//
//    val v: Int = if (a > 5) {
//      "greater than 5"
//    } else {
//      "less than 5"
//    }
//
//    println(v)


    val multiplyBy2 = (x: Int) => x * 2


    val res = List(1,2,3,4,5).map(multiplyBy2)


//    println(res)


    val byte: Byte = 123

    Byte.MaxValue
    Byte.MinValue

    val tuple: (String, String, Int) = ("Andrew", "Moscow", 33)

//    println(tuple._1)
//    println(tuple._2)
//    println(tuple._3)



    class Animal(val name: String) {

      import Animal._

      def hello: Unit = {
        println(s"Hello, I'm $name")
      }

      def printType: Unit = {
        println(animalType)
      }

      override def equals(o: Any): Boolean = {
        o match {
          case animal: Animal =>
            animal.name == this.name
          case _ =>
            false
        }
      }

      override def hashCode(): Int = name.hashCode
    }

    object Animal {

      val animalType: String = "This is a dog"

      def apply(name: String): Animal = {
        if (name.length < 3) {
          throw new RuntimeException("Name lower than 3")
        }

        new Animal(name)
      }


    }

    val a1 =  Animal("zhuchka")
    val a3 =  Animal("zhuchka")

    val a2 = new Animal("strelka")


    a1.hello
    a2.hello


    println(a1 == a3)

    println(a1.hashCode())
    println(a3.hashCode())
    println(a2.hashCode())


    println(a1.printType)
    println(a2.printType)
    println(a3.printType)

//    println(a1 == a2)


  }

  case class Data(name: String, city: String, age: Int) {
    def hello = println("Hello from" + name)
  }

  val d1 = Data("a", "b", 1)

}
