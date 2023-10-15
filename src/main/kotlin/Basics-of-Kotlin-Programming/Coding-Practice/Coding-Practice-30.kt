package `Coding-Practice`

/*
Print the value present at index 6 in the given array.
arr = [0, 100, 200, 300, 400, 500].
Use try-catch to catch the exception if any.
 */

fun main(){

    // write your code here
    var arr : Array<Int> = arrayOf<Int>(0, 100, 200, 300, 400, 500)

    try{
        val element = arr[6];
        println("Successfully fetched the element in array at 6th index")
        println("The element at 6th index is $element")
    }
    catch(e : ArrayIndexOutOfBoundsException){
        println("Caught an exception. The following range does not exist in Array")

    }
    finally {
        for (i in arr)
        print("$i ")
    }

}

/*
fun main() {
val arr = arrayOf(0, 100, 200, 300, 400, 500)
try {
   println(arr[6])
} catch (e: Exception){
   println("Index 6 is not present in the array")
}
}
 */

