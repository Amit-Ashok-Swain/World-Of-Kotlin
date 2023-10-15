package `Coding-Practice`
/*
Problem Statement - Print the first 50 natural numbers using ‘for’, ‘while’, and ‘do-while’ loops.
 */
fun main() {
    // write your code here
    val num = 50
    // for loop
    var sum = 0
    for(i in 1..num){
        sum+=i
    }
    println(sum)

    // while loop
    var number1 = 1
    var sum1 = 0
    var count1 = 0
    while(count1<num){
        sum1+=number1
        number1++
        count1++
    }
    println(sum1)

    // do-while loop
    var number2 = 1
    var sum2 = 0
    var count2 = 0
    do{
        sum2+=number2
        number2++
        count2++;
    }

    while(count2<num)
    println(sum2)
}