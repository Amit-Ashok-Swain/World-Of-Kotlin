package `Coding-Practice`
/*
Print the odd numbers from 100 to 1 using ‘for’, ‘while’, and ‘do-while’ loops.
 */
fun main() {

    // write your code here
    //for loop
    val num = 100
    for(i in num downTo 1){
        if(i%2==1){
            print("$i ")
        }
    }
    println()

    // while loop
    var num1 = num
    while(num1>0){
        if(num1==num){
            num1--
        } else{
            print("$num1 ")
            num1-=2
        }
    }
    println()
    // do-while loop
    var num2 = num
    do{
        if(num2==num){
            num2--
        } else{
            print("$num2 ")
            num2-=2
        }
    }
    while(num2>0)


}