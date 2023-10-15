package `Coding-Practice`

/*
Perform the operations given below on two variables (2500, 250):
Addition
Subtraction
Multiplication
Division
 */

fun main() {
  val num1 = 2500
  val num2 = 250

  var ans : Int

  ans = num1+num2

    println("The addition of $num1 + $num2 = $ans")

    ans = num1-num2

    println("The subtraction of $num1 - $num2 = $ans")

    ans = num1*num2

    println("The multiplication of $num1 * $num2 = $ans")

    ans = num1/num2

    println("The Division of $num1 / $num2 = $ans")
}