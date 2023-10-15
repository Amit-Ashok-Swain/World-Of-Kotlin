package `Coding-Practice`
/*
Problem Statement - Print the first 50 natural numbers using ‘for’, ‘while’, and ‘do-while’ loops.
 */
fun main() {
    // write your code here
    val num = 50
    // for loop
    for(i in 1..num){
        print("$i " )
    }
    println()

    // while loop
    var number1 = 1
    while(number1<=num){
        print("$number1 ")
        number1++
    }

    println()

    // do-while loop
    var number2 = 1
    do{
        print("$number2 ")
        number2++
    }

    while(number2<=num)

}