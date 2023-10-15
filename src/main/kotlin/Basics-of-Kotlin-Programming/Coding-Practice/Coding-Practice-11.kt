package `Coding-Practice`

/*
Create an array of the first five natural numbers and an array of all boolean values
 */

import java.util.*;

fun main() {
    // Write your code here
    val arrayOfNumber : Array<Int> = arrayOf<Int>(1,2,3,4,5)
    val arrayOfBoolean : Array<Boolean> = arrayOf<Boolean>(true,false)

    println(Arrays.toString(arrayOfNumber))
    println(Arrays.toString(arrayOfBoolean))

}