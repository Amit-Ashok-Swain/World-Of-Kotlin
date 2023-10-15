package `Coding-Practice`
/*
Create an array in Kotlin which contains data of all the different data types
and print the complete array using the Arrays.toString()
 */
import java.util.*

fun main(){
    // Write your code here
    val arrayOfAllDataTypes : Array<Any> = arrayOf<Any>(7,"Amit",'M','g',45.18,7.1810, true, false, "Happy World")

    println(Arrays.toString(arrayOfAllDataTypes))
}