package `Coding-Practice`

/*
Create a program in Kotlin to calculate the factorial of number 7.
 */

fun main() {

    // write your code here
    val num = 7
    println(factorial(num))

}

fun factorial(num : Int) : Int{
    var product = 1
    for(i in num downTo 1){
        product *= i
    }

    return product
}