package Assignment1

import jdk.nashorn.internal.objects.NativeString.substring

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.UnrolledBuffer.unrolledlength

object Mapping {
  def main(args: Array[String]){
    val keyvalue= Map("Product10"->100,
      "Product20"->200,
      "Product30"->300,
      "Product40"->400,
      "Product50"->500,
      "Product60"->600,
      "Product70"->700,
      "Product80"->800,
      "Product90"->900,
      "Product10"->1000)
    println(keyvalue)

  }
}

object CollectionMapping {
  def main(args: Array[String]): Unit = {
    val collection = List(1, 2, 3, 4, 5, 6)
    val res = collection.reduce((x, y) => x max y)
    println(res)
  }
}

  object Function {
    def main(args: Array[String]) {
      var increase = (x: Int) => x + 1
      val v1 = List(2.0, 3.0, 4.0, 5, 6, 7)
      println(increase)
      println(v1)
    }
  }


  object Realnumber {
    def main(args: Array[String]) {
      def f(arr: List[Int]): Unit = {
        val list = new ListBuffer[Int]()
        val len = arr.length
        for (i <- 5 until 12) {
          {
            if (arr(i) < -5) {
              list.append((-1) * arr(i))
            }
            else {
              list.append((arr(i)))
            }
          }
          return list.toList;
        }
      }
    }
  }

  object Tuples {
    def main(arg: Array[String]): Unit = {
      val id1 = ("SCALA", 10, 1.0)
      println(id1)
      val first = id1._1
      val second = id1._2
      val third = id1._3
      println(first)
      println(second)
      println(third)
    }

}

object Fold1 {
  def main(args: Array[String]): Unit={
    val days=List("Sun","Mon","Tue","Wed","Thur","Fri","Sat")
    days.foldLeft(""){
      (m: String,n: String)=>println("m: " + m + "n: " + n);m + n
        days.foldRight("") {
          (m: String, n: String) =>
            println("m: " + m + "n: " + n);
            m + n

        }
    }
  }
}


