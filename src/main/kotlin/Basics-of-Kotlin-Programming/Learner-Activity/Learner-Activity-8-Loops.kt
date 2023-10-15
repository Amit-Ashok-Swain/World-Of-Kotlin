package `Learner-Activity`

fun main() {

    // Print Numbers from 10 to 1 using a 'for' loop
    for(i in 10 downTo 1){
        println(i)
    }

    // Print Even Numbers from 0 to 20 using a 'for' loop
    for (i in 0..20 step 2){
        println(i)
    }

    // Print characters of a String using a 'for' loop
    val text = "Hello, Kotlin"
    for(char in text){
        println(char)
    }


   //Nested Loop to create a Pattern
    for (i in 1..5){
        for (j in 1..i){
            print("* ")
        }
        println()
    }

    // Print factorial of a Number using a 'for' loop
    val num = 7
    var res = 1;
    for(i in num downTo 1){
        res *= i
    }
    println(res)

    // Print Fibonacci Sequence using a 'while' loop and for loop
    // using while loop
    val n = 10
    var a = 0
    var b = 1
    var count = 0
    while(count<n){
        if(count==n-1){
            print(a)
        }else {
            print("${a}, ")
        }
        val sum = a+b
        a=b
        b=sum
        count++;
    }
    println()

    //using for loop
    val limit = 20
    var num1 = 0
    var num2 = 1
    // using for loop
    for(i in 0 until n){
        if(i==n-1){
            println(num1)
        }else {
            println("${num1}, ")
        }
        val add = num1+num2
        num1=num2
        num2=add
    }

    // Check Prime Numbers or not
    val number1 = 31
    val number2 = 30
    var flag = true
    for(i in 2 until number1) {

        if (number1 % i == 0) {
            flag = false
            break;
        }
    }
        if(flag){
            println("Prime")
        }else{
            println("Not Prime")
        }

    for(i in 2 until number2) {

        if (number2 % i == 0) {
            flag = false
            break;
        }
    }
    if(flag){
        println("Prime")
    }else{
        println("Not Prime")
    }

    // Print a Pyramid Pattern Using Nested Loops
    val rows = 5
    for(i in 1..rows) { // 2
        for (j in 1..rows - i) { // 1<=1
            print(" ")
        }
        for (k in 1..2*i-1){ // 3
            print("* ")
        }
        println()
    }

    // Print the sum of the Numbers in a Range Using a 'for' Loop

    val start = 1
    val end = 15
    var sum = 0

    for (i in start..end){
        sum+=i
    }
    println("The sum of numbers from $start to $end is $sum")

    // Print the First N Square Numbers Using a 'do-while' loop

    val squareLimit = 5
    var i = 1
    do{
        println("$i^2 = ${i*i}")
        i++

    }
        while(i<=squareLimit)

        // Print a Diamond Pattern Using Nested Loops:

    val m = 5
    for (i in 1..m) {
        for (j in 1..m - i) {
            print("  ")
        }
        for (k in 1..2 * i - 1) {
            print("* ")
        }
        println()
    }
    for (i in m - 1 downTo 1) {
        for (j in 1..m - i) {
            print("  ")
        }
        for (k in 1..2 * i - 1) {
            print("* ")
        }
        println()
    }

    // Some examples using functions

    // Print Prime Numbers Between 1 and 50 Using Nested for Loops:

    for (i in 2..50) {
        if (isPrime(i)) {
            println(i)
        }
    }

    // Print the Collatz Sequence for a Given Number:
    val startingNumber = 6
    println("Collatz sequence for $startingNumber: ")
    collatzSequence(startingNumber)

    // Print a Pascal's Triangle Using Nested Loops:
    // Function
    fun factorial(n: Int): Long = if (n == 0) 1 else n * factorial(n - 1)
    val numRows = 6

    for (i in 0 until numRows) {
        for (j in 0 until numRows - i) {
            print("  ")
        }
        for (j in 0..i) {
            print("${factorial(i) / (factorial(j) * factorial(i - j))}   ")
        }
        println()
    }

    //Activity 1
    /*
    Problem Statement - Calculate the sum of the first 100 natural numbers using the concept of loops.
     */
    val startNum = 1
    val endNum = 100
    var totalSum = 0;
    for(i in 1..100){
        totalSum +=i
    }
    println(totalSum)

    //Activity 2
    /*
    Problem Statement - Print the even and odd numbers from 1 to 100 using the ‘while’ and ‘do-while’ loop.
     */

    // even
    // using while
    var startingLimit1 = 1
    val endingLimit1 = 100

    while(startingLimit1<=endingLimit1){
             if(startingLimit1==1){
                 startingLimit1+=1
             }
            println(startingLimit1)
            startingLimit1 += 2
        }
    // using do-while
    var startingLimit2 = 1
    val endingLimit2 = 100
    do {
        if (startingLimit2 == 1) {
            startingLimit2++;
        } else {
            print("${startingLimit2} ")
            startingLimit2 += 2;
        }
    }
        while (startingLimit2<=endingLimit2)



    // odd
    // using while
    var startingLimit3 = 1
    val endingLimit3 = 100

    while(startingLimit3<=endingLimit3){
        println(startingLimit3)
        startingLimit3 += 2
    }
    // using do-while
    var startingLimit4 = 1
    val endingLimit4 = 100
    do {
            print("${startingLimit4} ")
            startingLimit4 += 2;
        }
    while (startingLimit4<=endingLimit4)

}


// Prime Functions
fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

// Collatz Sequence function
fun collatzSequence(n: Int) {
    var num = n
    print("$num ")
    while (num != 1) {
        if (num % 2 == 0) {
            num /= 2
        } else {
            num = 3 * num + 1
        }
        print("$num ")
    }

}