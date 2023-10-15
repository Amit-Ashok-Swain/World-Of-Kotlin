package `Coding-Practice`

/*
Write different functions for calculating sum, difference, product, and division of two numbers
and return each of them.
 */

fun main() {
    // Write your code here
    val num1 = 65
    val num2 = 13

    println(sum(num1,num2))
    println(difference(num1,num2))
    println(product(num1,num2))
    println(division(num1,num2))
}

fun sum(x:Int, y:Int) : Int = x+y

fun difference(x:Int, y:Int) : Int = x-y

fun product(x:Int, y:Int) : Int = x*y

fun division(x:Int, y:Int) : Int = x/y