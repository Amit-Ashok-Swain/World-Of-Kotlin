package `Coding-Practice`
/*
Create a function called ‘compareArrayLength’ which
checks the length of two string arrays to be equal or not.
 */
fun main() {

    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    if(compareArrayLength(a, b)){
        println("The length of two string arrays are equal")
    }else{
        println("The length of two string arrays are not equal")

    }
}

// Create compareArrayLength() function here

fun compareArrayLength(arr1:Array<String>,arr2:Array<String>):Boolean = (arr1.size == arr2.size)