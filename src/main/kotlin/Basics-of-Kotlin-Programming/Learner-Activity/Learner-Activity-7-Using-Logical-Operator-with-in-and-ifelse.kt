package `Learner-Activity`

fun main() {

    // Using 'in' Operator in 'if-else' Blocks:

    // 1] Checking if a Number is within a Range

    val number1 = 45

    if(number1 in 1..100){
        println("Number is within the range of 1 to 100")
    }else{
        println("Number is outside the range")
    }

    val number2 = 130

    if(number2 in 1..120){
        println("Number is within the range of 1 to 100")
    }else{
        println("Number is outside the range")
    }

    // 2] Checking if a Character is in String

    val char1 = 'm'
    val str1 = "Amit"

    if(char1 in str1){
        println("\'$char1\' is in the string \"$str1\"")
    } else {
        println("\'$char1\' is not in the string \"$str1\"")
    }

    val char2 = 'a'
    val char3 = 'k'
    val str2 = "Kotlin"

    if(char2 in str2){
        println("\'$char2\' is in the string \"$str2\"")
    } else {
        println("\'$char2\' is not in the string \"$str2\"")
    }

    // case-sensitive check
    if(char3 in str2){
        println("\'$char3\' is in the string \"$str2\"")
    } else {
        println("\'$char3\' is not in the string \"$str2\"")
    }

    // 3] Checking if Char is in a Char Range

    val character1 = 'k'

    val character2 = 'G'

    if(character1 in 'a'..'z'){
        println("$character1 is a lowercase letter")
    } else {
        println("$character1 is not a lowercase letter")
    }

    if(character2 in 'a'..'z'){
        println("$character2 is a lowercase letter")
    } else {
        println("$character2 is not a lowercase letter")
    }

    // 4] Using 'in' with Double and range of Double

    val decimalNum1 = 6.1287
    val decimalNum2 = 12.4514

    val decimalNumRange = 0.0000 .. 10.0000

    if(decimalNum1 in decimalNumRange){
        println("$decimalNum1 is in the range 0 to 10")
    } else {
        println("$decimalNum1 is not in the range 0 to 10")
    }

    if(decimalNum2 in decimalNumRange){
        println("$decimalNum2 is in the range 0 to 10")
    } else {
        println("$decimalNum2 is not in the range 0 to 10")
    }

    // 5] Using 'in' with Float and range of

    val floatDecimalNum1 = 36.57F
    val floatDecimalNum2 = 98.57F

    val floatNumRange = 0.00F..50.00F

    if(floatDecimalNum1 in floatNumRange){
        println("$floatDecimalNum1 is in the range 0 to 50")
    } else {
        println("$floatDecimalNum1 is not in the range 0 to 50")
    }

    if(floatDecimalNum2 in floatNumRange){
        println("$floatDecimalNum2 is in the range 0 to 50")
    } else {
        println("$floatDecimalNum2 is not in the range 0 to 50")
    }

    val number:Int = 5

    val floatRange = 0.0F..10.0F

    if(number.toFloat() in floatRange){
        println("$number is in the float range 1 to 10")
    } else {
        println("$number is not in the float range 1 to 10")
    }

    val checkNumber:Int = 17

    val longRange = 0..20

    if(checkNumber.toLong() in longRange){
        println("$number is in the long range 0 to 20")
    } else {
        println("$number is not in the long range 0 to 20")
    }

    val num:Int = 12

    val doubleRange = 0.00000..30.00000

    if(checkNumber.toDouble() in doubleRange){
        println("$number is in the double range 0 to 30")
    } else {
        println("$number is not in the double range 0 to 30")
    }


}