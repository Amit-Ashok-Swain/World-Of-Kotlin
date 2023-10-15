fun main() {
// Problem Statement: Check if a number is greater than zero and less than five.
    // if-else
    val num1 = 3
    if(num1>0 && num1<5){
        println("The number in the variable num1 is greater than zero and less than five")
    }else{
        println("The number in the variable num1 is not greater than zero and less than five")

    }

    //when

    val num2 = 6

    when(num2){
        in 1..4 ->println("The number in the variable num1 is greater than zero and less than five")
        else ->println("The number in the variable num1 is not greater than zero and less than five")

    }

    val num3 = 1
    when{
        num3>0 && num3<5 -> println("The number in the variable num1 is greater than zero and less than five")
        else -> println("The number in the variable num1 is not greater than zero and less than five")
    }

    /*
    Problem Statement - Take an integer and check whether it is non-zero
    (could be either positive or negative) or zero
    Print relevant statements for each
     */
   // if-else
    val number1 = 0

    if(number1<0 || number1>0){
        println("It's a non-zero integer")
    }else{
        println("It's a zero integer")
    }

    val number2 = -14

    if(number2>0 || number2<0){
        println("It's a non-zero integer")
    }else{
        println("It's a zero integer")
    }

    val number3 = 55

    if(number3>0 || number3<0){
        println("It's a non-zero integer")
    }else{
        println("It's a zero integer")
    }

  // when

    val number4 = 0

    when{
        (number4>0 || number4<0) -> println("It's a non-zero integer")
    else -> println("It's a zero integer")
    }

    val number5 = -27

    when{
        (number5>0 || number5<0) -> println("It's a non-zero integer")
        else -> println("It's a zero integer")
    }

    val number6 = 7

    when{
        (number5>0 || number6<0) -> println("It's a non-zero integer")
        else -> println("It's a zero integer")
    }

    /*
    Problem Statement - Declare an integer variable and check if the value is greater than
    or equal to zero and less than or equal to five. If yes, print the statement
    "The value of the integer is between 0-5, "The value of the integer is not between 0-5"
     */

    // if-else

    val checkNumberRange1 = 3

    if(checkNumberRange1>=0 && checkNumberRange1<=5){
        println("The value of the integer is between 0-5")
    }else{
        println("The value of the integer is not between 0-5")
    }

    // when

    val checkNumberRange2 = 6

    when(checkNumberRange2){
        in 0..5 -> println("The value of the integer is between 0-5")
        else -> println("The value of the integer is not between 0-5")
    }

    // Problem Statement - Declare a variable and check if it lies within a specific range

    // range - 11 to 20
    val numberRange1 = 15

    val numberRange2 = 27
    //if-else

    if(numberRange1>=11 && checkNumberRange1<=27){
        println("The number is in range")
    }else{
        println("The number is not in range")
    }

    if(numberRange2>=11 && checkNumberRange2<=27){
        println("The number is in range")
    }else{
        println("The number is not in range")
    }

    // when


    when(numberRange1){
        in 11..20 -> println("The number is in range")
        else -> println("The number is not in range")
    }

    when(numberRange2){
        in 11..20 -> println("The number is in range")
        else -> println("The number is not in range")
    }


}