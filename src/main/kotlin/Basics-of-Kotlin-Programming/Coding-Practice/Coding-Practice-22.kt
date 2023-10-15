package `Coding-Practice`
/*
Print the even numbers from 100 to 1 using ‘for’, ‘while’, and ‘do-while’ loops.
*/

fun main() {

    // write your code here
    val num = 100
    // for loop
    for(i in num downTo 1 step 2){
        print("$i ")
    }
    println()


    // while loop
    var number1 = num
    while(number1>0){
        print("$number1 ")
        number1-=2
    }
    println()


    // do-while loop
    var number2 = num
    do{
        print("$number2 ")
        number2-=2
    }
    while(number2>0)


}
