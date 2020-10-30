package Assignment1
import java.lang.String
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader

import scala.io.StdIn.readLine

object DayOfTheWeek {
  def main(args: Array[String]) {
    val DayOfTheWeek = List("Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat")
    for (day <- DayOfTheWeek) {
        println(day)
    }
  }
}

object Main {
  def main(args: Array[String]) {
    for(w<- 1 to 7){
      println(w)
    }
  }
}

object Days{
  def main(args: Array[String]){
    val Days= List("Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat")

    for(day<- Days
        if day.startsWith("S"))
      println(day)
  }
}
object Recursion {
  def main(args: Array[String]) {
    val x = "DayOfTheWeek"
    print(revs(x))

    def revs(x: String): String = {
      if (x.length == 1) x
      else revs(x.tail) + x.head

    }
  }
}
object Recursionlist {
  def main(args: Array[String]){
    println("This is Scala")
    val name= readLine()

    val lst = buildList()
    println(lst)
  }
  def buildList(): List[String]={
    val input=readLine()
    if(input =="quit")Nil
    else input ::buildList()
  }
}

object Option {
  def main(args: Array[String]){
   val a1=Map("Alex"->"author","Aga"->"coder")
    val x= a1.get("Alex")
    val y=a1.get("coder")
    println(x)
    println(y)
    
     val some:Option[Int]= Some(20)
      val none:Option[Int]= None
        val x1=some.isEmpty
        val y1=none.isEmpty
        println(x1)
        println(y1)    
              
          val some1:Option[Int]=Some(1000)
            val none1:Option[Int]=None
              val x2= some1.getOrElse(0)
              val y2= none1.getOrElse(2000)
              println(x2)
              println(y2)

    }
  }


     /*object Tailrec {
  def main(args: Array[String]){
   def tailrecLength(list: List[String], accumulator:Long): Long=list match {
     case Nil=>accumulator
     case head:: tail=> tailrecLength(tail, accumulator+1)
   }
     }

}*/