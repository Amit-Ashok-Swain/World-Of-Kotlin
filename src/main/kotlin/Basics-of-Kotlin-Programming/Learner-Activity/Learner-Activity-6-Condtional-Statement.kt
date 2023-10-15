package `Learner-Activity`
/*
Play around with if-else and when.
Try to think of more cases to compare
(Compare strings with characters,
integers with double, integers with strings, etc. and see what happens).
 */
fun main() {
    // #If else statement

    // 1. Comparing Strings with Characters:

    val str1 = "Hello"
    val charLetter1 = 'H'

    if(str1 == charLetter1.toString()){
        println("String and character are equal")
    }else{
        println("String and character are not equal")
    }

    val str2 = "A"

    val charLetter2 = 'A'

    if(str2 == charLetter2.toString()){
        println("String and character are equal")
    }else{
        println("String and character are not equal")
    }

    // 2. Comparing Integers with Doubles:

    val intVal1 = 5
    val doubleVal1 = 5.0

    if (intVal1 == doubleVal1.toInt()) {
        println("Integer and double are equal after conversion")
    } else {
        println("Integer and double are not equal after conversion")
    }


    val intVal2 = 5
    val doubleVal2 = 5.1

    if (intVal2 == doubleVal2.toInt()) {
        println("Integer and double are equal after conversion")
    } else {
        println("Integer and double are not equal after conversion")
    }

    val intVal3 = 5
    val doubleVal3 = 5.5

    if (intVal3 == doubleVal3.toInt()) {
        println("Integer and double are equal after conversion")
    } else {
        println("Integer and double are not equal after conversion")
    }

    val intVal4 = 5
    val doubleVal4 = 5.99

    if (intVal4 == doubleVal4.toInt()) {
        println("Integer and double are equal after conversion")
    } else {
        println("Integer and double are not equal after conversion")
    }

    val intVal5 = 5
    val doubleVal5 = 6

    if (intVal5 == doubleVal5.toInt()) {
        println("Integer and double are equal after conversion")
    } else {
        println("Integer and double are not equal after conversion")
    }

    val intVal6 = 1
    val doubleVal6 = 0.99

    if (intVal6 == doubleVal6.toInt()) {
        println("Integer and double are equal after conversion")
    } else {
        println("Integer and double are not equal after conversion")
    }

    // 3. Comparing Integers with Strings:

    val intValue1 = 10
    val stringNum1 = "10"

    if (intValue1 == stringNum1.toIntOrNull()) {
        println("Integer and string are equal after conversion")
    } else {
        println("Integer and string are not equal after conversion")
    }

    val intValue2 = 10
    val stringNum2 = "10.5"

    if (intValue2 == stringNum2.toIntOrNull()) {
        println("Integer and string are equal after conversion")
    } else {
        println("Integer and string are not equal after conversion")
    }

    // 4. Comparing Double with Strings:
    val doubleValue1 = 10.5
    val stringDoubleNum1 = "10.5"

    if (doubleValue1 == stringDoubleNum1.toDoubleOrNull()) {
        println("Double and string are equal after conversion")
    } else {
        println("Double and string are not equal after conversion")
    }

    val doubleValue2 = 12.56
    val stringDoubleNum2 = "12.560"

    if (doubleValue2 == stringDoubleNum2.toDoubleOrNull()) {
        println("Double and string are equal after conversion")
    } else {
        println("Double and string are not equal after conversion")
    }

    val doubleValue3 = 12.56
    val stringDoubleNum3 = "12.561"

    if (doubleValue3 == stringDoubleNum3.toDoubleOrNull()) {
        println("Double and string are equal after conversion")
    } else {
        println("Double and string are not equal after conversion")
    }

    // check two characters are equal
    val char1 = 'A'
    val char2 = 'a'

    if (char1 == char2) {
        println("Characters are equal")
    } else {
        println("Characters are not equal")
    }

   // check two booleans are equal
    val condition = true

    if (condition) {
        println("The condition is true")
    } else {
        println("The condition is false")
    }

    // if-else-if or if-else ladder

    val score = 85

    if (score >= 90) {
        println("A")
    } else if (score >= 80) {
        println("B")
    } else if (score >= 70) {
        println("C")
    } else {
        println("F")
    }


    val humanAge = 25

    if (humanAge < 18) {
        println("Minor")
    } else {
        if (humanAge < 65) {
            println("Adult")
        } else {
            println("Senior")
        }
    }

    // When statement


    // when statements for any data-type
    val value1: Any = "Hello"

    when (value1) {
        is String -> println("It's a String")
        is Char -> println("It's a Char")
        is Int -> println("It's an Int")
        is Double -> println("It's a Double")
        else -> println("Unknown type(Boolean)")
    }

    val value2: Any = 3.654

    when (value2) {
        is String -> println("It's a String")
        is Char -> println("It's a Char")
        is Int -> println("It's an Int")
        is Double -> println("It's a Double")
        else -> println("Unknown type(Boolean)")
    }

    val value3: Any = true

    when (value3) {
        is String -> println("It's a String")
        is Char -> println("It's a Char")
        is Int -> println("It's an Int")
        is Double -> println("It's a Double")
        else -> println("Unknown type(Boolean)")
    }

    val mathValue: Any = 3.14

    when (mathValue) {
        is Int -> println("It's an Int")
        is Double -> {
            if (mathValue == 3.14) {
                println("It's the mathematical constant Pi")
            } else {
                println("It's a Double but not Pi")
            }
        }
        else -> println("Unknown type")
    }

    val birthDate: Any = 7

    when (birthDate) {
        is Int -> {
            if(birthDate==7){
                println("It's my birthdate")
            }else{
                println("It's an Integer but not my birthdate")
            }
        }
        is Double -> println("Dates can't be decimal")
        else -> println("Unknown type")
    }

    // check string days of week using when
    val day = "Monday"

    when (day) {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> println("Weekday")
        "Saturday", "Sunday" -> println("Weekend")
        else -> println("Unknown")
    }

    // Age verification using when and range
    val age = 25

    when (age) {
        in 0..17 -> println("Child")
        in 18..60 -> println("Adult")
        else -> println("Senior")
    }

    // Check number of digits
    val digit: Any = 42

    when (digit) {
        is Int -> {
            if (digit < 10) {
                println("Single digit integer")
            } else {
                println("Double digit integer")
            }
        }
        is String -> println("String")
        else -> println("Unknown")
    }
}