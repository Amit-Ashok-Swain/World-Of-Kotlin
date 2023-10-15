package `Coding-Practice`
/*
Problem Statement - Print all the values of the array arr = [1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20] in a new line.
 */

fun main() {

    // write your code here
    val arr : Array<Int> = arrayOf<Int> (1,2,4,6,8,10,12,14,16,18,20)

    for(i in 0 until arr.size){
        println(arr[i])
    }

    for(i in arr){
        print("$i ")
    }
}