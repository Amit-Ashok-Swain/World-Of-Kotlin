package `Learner-Activity`
/*
Google ‘Kotlin Null Safety’ and check out the official documentation of this. Look at the examples of programs given in this link.
https://kotlinlang.org/docs/null-safety.html
https://kotlinlang.org/docs/java-to-kotlin-nullability-guide.html#what-s-next
https://kotlinlang.org/docs/generics.html
 */
fun main() {
  /*
  Kotlin's null safety is a powerful feature that helps prevent null pointer exceptions in your code.
  It enforces a discipline for handling nullable and non-nullable types, making your code more reliable and less prone to crashes.
   */

    /*
     A. Nullable Types:
     In Kotlin, you explicitly specify if a variable can hold a null value by adding a ? to the type.
    For example:
     */
    var nullableString: String? = null
    var nonNullableString: String = "Hello, World"

    /*
    The nullableString can hold either a string or a null value, whereas nonNullableString can only hold a non-null string.
     */

   /*
   B. Safe Calls (?.):
    You can use the safe call operator ?. to access properties or call methods on nullable objects safely. If the object is null, the expression will return null.
    For example:
    */

    val length: Int? = nullableString?.length

    /*
    Here, length will be null if nullableString is null, and it will be the length of the string if nullableString contains a string.
     */

    /*

    C. Elvis Operator (?:):
    The Elvis operator ?: allows you to provide a default value when dealing with nullable values.
    For example:
     */

    val elvisLength: Int = nullableString?.length ?: -1

    /*
    If nullableString is null, length will be set to -1. Otherwise, it will be the length of the string.
     */

    /*
    D. Not-null Assertion (!!):
    You can use the not-null assertion operator !! when you are absolutely certain that a nullable value is not null. Be cautious, as using !! on a null value will result in a runtime exception.
    For example:
     */
   // val assertionLength: Int = nullableString!!.length

    /*
    E. Safe Casts (as?):
    Safe casts allow you to safely cast a value to a different type. If the cast fails, it returns null.
    For example:
     */

    val doubleValue: Double? = nullableString as? Double

    /*
    If nullableString can be safely cast to a Double, doubleValue will hold the cast value; otherwise, it will be null.
     */

    /*
    F. Checking for Null:
    You can use conditional checks to determine if a value is null or not.
    For example:
     */

    if (nullableString != null) {
        // Do something with nullableString
    } else {
        // Handle the case where nullableString is null
    }
    /*
    This pattern is especially useful when you want to perform different actions based on the nullability of the variable.
     */
    /*
    Kotlin's null safety encourages a more disciplined approach to dealing with null values, reducing the risk of null pointer exceptions.
    It also promotes code that is easier to read and understand, as it makes the null handling explicit.
     */


    //Examples:

    //1.Nullable Types and Safe Calls:

    val nullableString1: String? = null

    // Safe call operator
    val length1: Int? = nullableString1?.length
    println("Length of the string: $length1") // Output: Length of the string: null


    //2.Elvis Operator for Providing Defaults:

    val nullableString2: String? = null

   // Using the Elvis operator to provide a default
    val length2: Int = nullableString2?.length ?: -1
    println("Length of the string: $length2") // Output: Length of the string: -1


   // 3.Not-null Assertion Operator (Use with Caution):

    val nullableString3: String? = "Hello, World"

   // Using the not-null assertion operator
    val length3: Int = nullableString!!.length
    println("Length of the string: $length3") // Output: Length of the string: 13


   // 4. Safe Casts (as?):

     val value: Any = "42"

     // Safe cast to Int
    val intValue: Int? = value as? Int
    println("Integer value: $intValue") // Output: Integer value: 42

  // 5. Checking for Null:

    val nullableString4: String? = "Hello, World"

    if (nullableString4 != null) {
        println("String is not null: $nullableString4")
    } else {
        println("String is null")
    }

    //6. Safe Calls with Collections:

    val nullableList: List<String>? = null

    // Safe call to get the first element of the list
    val firstElement: String? = nullableList?.first()
    println("First element: $firstElement") // Output: First element: null

    printLength("Hello, Kotlin") // Output: Length of the string: 12
    printLength(null) // Output: Length of the string: null

    /*
    Kotlin's null safety features help you handle nullable values in a controlled and predictable manner, reducing the risk of null pointer exceptions
     */
}

fun printLength(nullableString: String?) {
    val length = nullableString?.length
    println("Length of the string: $length")
}
