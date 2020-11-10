package Assignment2


object PatternMatching {
def main(args: Array[String]) {
    def getDayType(str: String): Unit = {
    val lowerStr = str.toLowerCase
    val weekDays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    val weekendDays = List("Saturday", "Sunday")
    lowerStr match {

      case lowerStr: String if weekDays.exists(lowerStr.contains(_)) => "Work"

      case lowerStr: String if weekendDays.exists(lowerStr.contains(_)) => "Weekend"
      case _ => println("No such day")
    }
    println("Output for 1: " + getDayType("Today is monday"))
  }
}
 }


object ParameterFunction extends App {
  def incrementFunc(number: Int): Int = {
    number + 1
  }
  def increaseByThree(number: Int, func: Int => Int): Int = {
    def helper(counter : Int, result: Int): Int = {
      if (counter == 0) result
      else helper(counter-1, func(result))
    }
    helper(3, number)
  }
  println(increaseByThree(5, incrementFunc))
}


class BankAccount( var balance: Double) {
  def main(args: Array[String]): Unit = {

    def this() {
      this(0)
      val acc1 = new BankAccount(30)
      println("initial balance: " + acc1.currentBalance())
      acc1.deposit(25.5)
      println("after deposit balance: " + acc1.currentBalance())
      acc1.withdraw(40.3)
      println("after withdraw balance: " + acc1.currentBalance())
      println()

      val acc2 = new BankAccount()
      println("Empty account: " + acc2.currentBalance())
    }

    def deposit(money: Double) = {
      balance += money
    }

    def withdraw(money: Double) = {
      balance -= money
    }

    def currentBalance() = balance
  }
}


class Greet( val firstName: String, val lastName: String) {
  def getFirstName: String = firstName

  def getLastName: String = lastName

  def greetGreet(g: Greet): String = g match {
    case g if g.getFirstName.equals("Saloni") => "Hello There!"
    case g if g.getLastName.equals("Nayi") => "General Nayi!"
    case _ => "Just Hi!"

        }
  def main(args: Array[String]): Unit ={
    val g1 = new Greet("Saloni", "Nayi")
    val g2 = new Greet("General", "Grievous")
    val g3 = new Greet("Darth", "Vader")

    println(greetGreet(g1))
    println(greetGreet(g2))
    println(greetGreet(g3))
    println()
  }
}


class Person( val firstName: String, val lastName: String, private var _tax: Double) {

  def tax: Double = _tax

  val p4 = new Person("Meghna", "Gulzaar", 40)
  println("Person tax:" + p4.tax)
  val employee = new Person("Kareena", "Kapoor", 30) with Employee
  val teacher = new Person("Aftab", "Qureshi", 50) with Teacher
  employee.salary = 4000
  teacher.salary = 4500
  println("Employee salary and tax:" + employee.salary + " " + employee.tax)
  println("Teacher salary and tax:" + teacher.salary + " " + teacher.tax)
  println()

  val employee_student = new Person("Aishwarya", "Rai", 10) with Employee with Student
  val student_employee = new Person("Shahrukh", "Khan", 20) with Student with Employee

  println(" Emp-Student tax" + employee_student.tax)
  println(" Student-Emp tax" + student_employee.tax)
  employee_student.salary = 3500
  student_employee.salary = 3600
  println("After salary changes")
  println(" Emp-Student(3500 salary) tax" + employee_student.tax)
  println(" Student-Emp(3600 salary) tax" + student_employee.tax)

}
trait Employee extends Person{
  private var _salary: Double = 0

  def salary = _salary
  def salary_= (value:Double):Unit = _salary = value

  override def tax: Double = _salary * 0.2
}

trait Teacher extends Employee {
  override def tax: Double = salary * 0.1
}

trait Student extends Person {
  override def tax: Double = 0
}









