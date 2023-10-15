import java.util.*

fun main() {

    // Declaring Array

    val arrayOfVowels : Array<Char> = arrayOf<Char>('a','e','i','o','u')

    var arrayOfNameLetters : Array<Char> = arrayOf<Char>('s','w','a','i','n')

    val arrayOfFirstName : Array<Char> = arrayOf<Char>('a','m','i','t')

    arrayOfNameLetters = arrayOfFirstName

    val arrayOfAllDataTypes : Array<Any> = arrayOf<Any>(7,"Amit",'g',98.5,true,'Z')

    val stringArray : Array<String> = arrayOf<String>("My","Name","is","Amit")

    println(stringArray.get(0))
    println(stringArray.get(1))
    println(stringArray.get(2))
    println(stringArray.get(3))

    println("---------------------------------")

    val stringArrayFullName : Array<String> = arrayOf<String>("My","last","name","is","Swain")

    println(stringArrayFullName[1])

    stringArrayFullName[1] = "full"

    println(stringArrayFullName[4])

    stringArrayFullName[4] = "Amit Ashok Swain"

    println("--------------")

    print(stringArrayFullName[0]+" ")

    print(stringArrayFullName[1]+" ")

    print(stringArrayFullName[2]+" ")

    print(stringArrayFullName[3]+" ")

    println(stringArrayFullName[4])

    // What is size of Array

    val sizeOfStringArray = stringArray.size

    println("The size of stringArray is $sizeOfStringArray ")

    // print using Arrays.toString() function

    println(Arrays.toString(stringArrayFullName))

   println(Arrays.toString(arrayOfVowels))

    println(Arrays.toString(arrayOfAllDataTypes))

}