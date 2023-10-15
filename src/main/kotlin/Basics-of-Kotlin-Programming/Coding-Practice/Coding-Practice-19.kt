package `Coding-Practice`
/*
Check whether a variable num = 40, lies between 30 to 50 or not.
 */
fun main() {
    val num = 40

    if(num in 30..50){
        println("Number lies between 30 to 50")
    }else{
        println("Number does not lies between 30 to 50")
    }
}