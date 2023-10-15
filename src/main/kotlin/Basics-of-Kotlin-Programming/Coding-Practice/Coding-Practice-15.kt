package `Coding-Practice`

/*
Create a function in Kotlin which has a string and an array which contains the index of all the vowels present in that string.
Print the array, and then calculate the sum of all the values of the array.
Use the string: “I am a Kotlin programmer now”.
 */
import java.util.*

fun main() {
    // Write your code here
    val myString = "I am a Kotlin programmer now"

    val vowelIndexArray : Array<Int> = arrayOf<Int>(0,2,5,8,11,16,19,22,26)

    val ans = vowelIndexArray[0]+ vowelIndexArray[1]+ vowelIndexArray[2]+ vowelIndexArray[3]+ vowelIndexArray[4]+ vowelIndexArray[5]+ vowelIndexArray[6]+ vowelIndexArray[7]+ vowelIndexArray[8]

    println(Arrays.toString(vowelIndexArray))
    println(ans)
}

