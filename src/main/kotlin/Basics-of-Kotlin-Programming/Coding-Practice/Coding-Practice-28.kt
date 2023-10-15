package `Coding-Practice`

/*
Create a program to print the first 10 numbers of Fibonacci series.
The Fibonacci Sequence is a series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
The next number is found by adding up the two numbers before it.
The 2 is found by adding the two numbers before it (1+1).
The 3 is found by adding the two numbers before it (1+2) and so on!
Example: the next number in the sequence above is 21+34 = 55.
 */

fun main() {
    val num = 10
    val list = fibonacciSeries(num)
    val ans = list.joinToString(separator = ", ")

    println(ans)
}

fun fibonacciSeries(num : Int) : ArrayList<Int> {
  var start = 0
    var end = 1
    val arrayList = arrayListOf<Int>()
    for(i in 1..num){
       val sum = start + end
        arrayList.add(start)
       start = end
        end = sum
    }

    return arrayList
}