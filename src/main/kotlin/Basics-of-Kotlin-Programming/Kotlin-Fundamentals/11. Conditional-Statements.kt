

fun main() {

    // 1] If Statement

    // # Problem Statement - Write a program to divide variable a by variable b.

    val a = 84
    val b = 0
    val c = 12

    //Check whether the denominator is zero
    if (b == 0) {
        println("The division cannot be performed")
    } else {
        println("The division of a/b is ${a / b}")
    }

    if (c == 0) {
        println("The division cannot be performed")
    } else {
        println("The division of a/b is ${a / c}")
    }


    // # Problem Statement - Declare two integer variable and tell which of them is the greater number

    val num1 = 27
    val num2 = 7
    val num3 = 10

    if (num1 > num2) {
        println("The number in variable num1 is greater")
    } else {
        println("The number in variable num2 is greater")
    }

    if (num1 > num3) {
        println("The number in variable num1 is greater")
    } else {
        println("The number in variable num3 is greater")
    }

    if (num2 > num3) {
        println("The number in variable num2 is greater")
    } else {
        println("The number in variable num3 is greater")
    }


    /* # Problem Statement - Declare two variables and assign them integer values.
       Check which of these two variables is greater and assign the value of this
       variable to variable called maxValue
    */


    // Block body code
    val number1 = 86
    val number2 = 68

    val maxValue1: Int

    if (number1 > number2) {
        maxValue1 = number1
    } else {
        maxValue1 = number2
    }

    println(maxValue1)


    //Expression body code
    val number3 = 77
    val number4 = 98

    val maxValue2: Int = if (number3 > number4) {
        number3
    } else {
        number4
    }

    println(maxValue2)


// 2] Nested If-Else Statements / if-else-ladder

// Problem Statement - Declare two integer variable and tell which of them is the greater number or equal

    val newNum1 = 45

    val newNum2 = 52

    if (newNum1 > newNum2) {
        println("The number in variable newNum1 is greater")
    }else if(newNum1<newNum2){
        println("The number in variable newNum2 is greater")
    }else{
        println("Both the variables newNum1 & newNum2 are equal")
    }

    val newNum3 = 25

    val newNum4 = 25

    if (newNum3 > newNum4) {
        println("The number in variable newNum3 is greater")
    }else if(newNum3<newNum4){
        println("The number in variable newNum4 is greater")
    }else{
        println("Both the variables newNum3 & newNum4 are equal")
    }


    // 3] when statement

    /*
     Problem Statement - Declare an integer variable and use the 'when' expression to
      print the integer in words
     */

    val numInWordsCheck1 = 7

    when(numInWordsCheck1){

        0-> println("Zero")
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        4-> println("Four")
        5-> println("Five")
        6-> println("Six")
        7-> println("Seven")
        8-> println("Eight")
        9-> println("Nine")

        else -> println("Number not found")
    }

    val numInWordsCheck2 = 21

    when(numInWordsCheck2){

        0-> println("Zero")
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        4-> println("Four")
        5-> println("Five")
        6-> println("Six")
        7-> println("Seven")
        8-> println("Eight")
        9-> println("Nine")

        else -> println("Number not found")
    }

    /*
    Problem Statement - Declare an integer variable and print
    'positive' if the number is greater than zero,
    'negative' if the number is less than zero,
    and 'zero' if the number is zero.
     */

    val numCheck1 = 7
    val numCheck2 = -5
    val numCheck3 = 0

    when{
        numCheck1>0 -> println("positive")
        numCheck1<0 -> println("negative")
        else -> println("zero")
    }

    when{
        numCheck2>0 -> println("positive")
        numCheck2<0 -> println("negative")
        else -> println("zero")
    }

    when{
        numCheck3>0 -> println("positive")
        numCheck3<0 -> println("negative")
        else -> println("zero")
    }
    when{

    }

}