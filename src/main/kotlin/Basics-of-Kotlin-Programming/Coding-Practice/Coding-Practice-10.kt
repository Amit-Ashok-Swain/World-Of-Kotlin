package `Coding-Practice`

/*
Write a function which compares two numbers and returns the maximum of the two.
You can search for ‘max function Kotlin’ on Google
or you can go to this https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.math/max.html to learn about the ‘max’ function.
 */

fun main() {
    val m = 74
    val n = 98

    println(findMax(m,n))
}

fun findMax(x:Int,y:Int):Int{
    return maxOf(x,y)
}