package `Coding-Practice`

/*
Create two arrays, one with the first 5 even numbers and another with first 5 odd numbers
and add each element of the first array with every corresponding element of the second array.
 */

import java.util.*

fun main() {
    // Write your code here
    val evenArray : Array<Int> = arrayOf<Int>(0,2,4,6,8)

    val oddArray : Array<Int> = arrayOf<Int>(1,3,5,7,9)

    oddArray[0] += evenArray[0]
    oddArray[1] += evenArray[1]
    oddArray[2] += evenArray[2]
    oddArray[3] += evenArray[3]
    oddArray[4] += evenArray[4]

    println(Arrays.toString(oddArray))

}