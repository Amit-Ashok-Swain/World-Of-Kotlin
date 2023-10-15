package `Kotlin-Fundamentals`

import java.io.IOException
import java.io.BufferedReader
import java.io.FileReader

/*
Error - An error is a serious problem that does not let a program run

Exception - An Exception indicates conditions that may or may not let the program run,
based on the execution of the program
 */
fun main() {
/*
    //Examples of errors

    //Error Message - Kotlin: Variable 'myVar' must be initialized
    var myVar : Int
    println(myVar)

    //Examples of Exceptions

    //ArithmeticException (Exception in thread "main" java.lang.ArithmeticException: / by zero)
    val a = 7
    val b = 0
   println(a/b)

   // ArrayIndexOutOfBoundsException (may partially run based on conditions) - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    val arr: Array<String> = arrayOf<String>("Hello", "Kotlin")
    println(arr[1])
    println(arr[2])

    // ArrayIndexOutOfBoundsException (may not run based on conditions) - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    println(arr[2])
    println(arr[1])
*/

    //Using the Try-Catch to Handle Exceptions

    /* Syntax :

                try {
                // block of code to monitor for errors
                // the code you think can raise an exception
                }
                catch (e1: ExceptionType1) {
                // exception handler for ExceptionType1
                }
                catch (e2: ExceptionType2) {
                // exception handler for ExceptionType2
                }
                .
                .
                .
                // optional
                finally {
                // block of code to be executed after try block ends
                }
     */

      //Examples of try-catch

    val d = arrayOf(3,4,5,6)
    try {
        d[4] = 7
        println("I ran and changed the size of Array and added the value")
    } catch (e : ArrayIndexOutOfBoundsException){
        println("I ran and caught the exception")
    } finally {
        println(d[3])
    }

    /* Null Pointer Exception
  A null pointer exception occurs when the compiler excepts value for a variable but instead gets NULL(no value)
   */

    // How to define Null Variable

    val nullStringValue : String? = null


    //Why do we use null safety operator(?) ?
    // -> A null safety operator is used to declare a variable whose may br null.

    println(nullStringValue)
    println(nullStringValue?.length) // safe call

    //non-null asserted call
   // println(nullStringValue!!.length) // returns null pointer exception -> it force IDE to give an output which is not NULL.


    //How can we print some message or default value for the user when the value of a variable is null?
    // -> Using the Elvis Operator (?:)
    println(nullStringValue?.length ?: "The length is Null")


    val nullIntegerValue : Int? = null
    val nullDouble : Double? = null
    val nullAnyValue : Any? = null

    println(nullIntegerValue)
    println(nullDouble)
    println(nullAnyValue)

   // How can we print the elements of an array or list without the null elements?
   // -> Use the filterNotNull() to remove the null elements from an array or list.

    val nullList = listOf(1,2,3,null,4,5,null,6,null,7)
    val nullArrayList = arrayListOf("This",null, "is","a",null,"Statement")

    print("The list without the null values is ${nullList.filterNotNull()} ")
    println()
    print("The ArrayList without the null values is ${nullArrayList.filterNotNull()} ")

    divide(3,0)
    readAndProcessFile("sample.txt")
    processFile("sample.txt")
    readFromFile("sample.txt")


}
 // Basic 'try' and 'catch'
fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: Division by zero")
        -1 // Return a default value in case of an exception
    }catch (e: IllegalArgumentException) {
        println("IllegalArgumentException: ${e.message}")
        -1
    }
}

fun readFromFile(filename: String) {
    val reader = try {
        BufferedReader(FileReader(filename))
    } catch (e: IOException) {
        println("Error opening file: ${e.message}")
        null
    } finally {
        println("Finally block executed")
    }

    try {
        reader?.use { fileReader ->
            val line = fileReader.readLine()
            println("Read line: $line")
        }
    } catch (e: IOException) {
        println("Error reading file: ${e.message}")
    }
}


fun readAndProcessFile(filename: String) {
    var reader: BufferedReader? = null
    try {
        reader = BufferedReader(FileReader(filename))
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            // Process each line of the file
            println(line)
        }
    } catch (e: IOException) {
        println("Error reading file: ${e.message}")
    } finally {
        try {
            reader?.close()
        } catch (e: IOException) {
            println("Error closing file: ${e.message}")
        }
    }
}


fun processFile(filename: String) {
    val reader: BufferedReader? = try {
        BufferedReader(FileReader(filename))
    } catch (e: IOException) {
        println("Error opening file: ${e.message}")
        null
    } finally {
        println("Entering the finally block")
    }

    try {
        if (reader != null) {
            // Use the reader to read the file
            println("Reading the file...")
        }
    } catch (e: IOException) {
        println("Error reading file: ${e.message}")
    } finally {
        println("Exiting the finally block")
        reader?.close()
    }

}










