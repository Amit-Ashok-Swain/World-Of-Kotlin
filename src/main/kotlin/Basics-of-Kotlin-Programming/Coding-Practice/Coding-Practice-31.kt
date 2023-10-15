package `Coding-Practice`

/*
Initialise a String as “Hello, Kotlin” and change its value to null.
Now print the length of the String using safe call and non-null assertion operator.
 */

fun main() {
    var text : String? = "Hello, Kotlin"
    text = null
    val safeLength = text?.length
    println(safeLength)
    /* val assertionLength = text!!.length
    println(assertionLength)
     */
}
