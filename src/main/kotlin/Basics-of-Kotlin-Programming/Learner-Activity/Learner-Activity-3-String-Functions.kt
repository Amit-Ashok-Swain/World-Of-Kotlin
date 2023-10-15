package `Learner-Activity`

import java.util.*

fun main() {

    // Resource from https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html#functions

    val sentence = "My Name is Amit Ashok Swain and I'm a Software Engineer."

    // String length
    val sentenceLength = sentence.length;

    // Get string character at any index
    val getStringIndex = sentence.get(12)

    //String subSequence
    val sentenceSubSequence = sentence.subSequence(3,15)

    // Get the starting index of a character
    val getIndexOfSentence = sentence.indexOf('A')

    // Get the lastIndexOf of a character
    val getLastIndexOfSentence = sentence.lastIndexOf('o')

    println(sentenceLength)
    println(getStringIndex)
    println(sentenceSubSequence)
    println(getIndexOfSentence)
    println(getLastIndexOfSentence)

   // CompareTo Functions

     /* 1
     compareTo function between two strings
     */

    // compareTo returns integer value positive, negative and zero

    //First it checks means it compare for the string size

    val str1 = "Apple" // total 5 chars
    val  str2 = "Banana" // total 6 chars

    val check1 = str1.compareTo(str2)
    // check 1 =  5-6 = -1 (size check)

    if(check1>0){
        println("The word Apple has more characters in string")
    }else if(check1<0){
        println("The word Apple has less characters in string")
    }
    println(check1)

    // After the string size is same then it compares with every character's ASCII Difference

    // A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
    // 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90

    val str3 = "Papaya" // total 6 chars
    val str4 = "Banana" // total 6 chars

    val checkAsciiDifference = str1.compareTo(str2)
   // check = P(80) - B(66) = 14

    if(checkAsciiDifference>0){
        println("The word Papaya has positive ASCII difference")
    }else if(checkAsciiDifference<0){
        println("The word Papaya has negative ASCII difference")
    }else{
        println("The strings are equal")
    }
    println(checkAsciiDifference)
      /* 2
      compareTo function between two strings but with case-sensitive
      */

    val word1 = "Happy"
    val word2 = "happy"

    // without ignore case
    val check2 = word1.compareTo(word2)
     // 72-104 = -32
    if(check2>0){
        println("The words are different is positive aspects")
    }else if(check2<0){
        println("The words are different is negative aspects")
    }else{
        println("The words are equal")
    }
    println(check2)

    // using ignore case with true
    val check3 = word1.compareTo(word2,ignoreCase = true)

    if(check3>0){
        println("The words are different is positive aspects")
    }else if(check3<0){
        println("The words are different is negative aspects")
    }else{
        println("The words are equal")
    }


    // using ignore case with false
    val check4 = word1.compareTo(word2,ignoreCase = false)

    if(check4>0){
        println("The words are different is positive aspects")
    }else if(check4<0){
        println("The words are different is negative aspects")
    }else{
        println("The words are equal")
    }

    val sen1 = "i love you dhana"
    val sen2 = "I Love You Dhana"

    val checkCaseSensitive = sen1.compareTo(sen2, ignoreCase = true)

    if(checkCaseSensitive>0){
        println("The sentences are different is positive aspects")
    }else if(checkCaseSensitive<0){
        println("The sentences are different is negative aspects")
    }else{
        println("The sentences are equal")
    }
     println(checkCaseSensitive)


 // equals() Function

    // equals() function returns boolean output true or false

  val wordCheck1 = "Hello"
  val wordCheck2 = "World"

  val ansCheck1 = wordCheck1.equals(wordCheck2)

    if(ansCheck1){
        println("Strings are equal")
    }else{
        println("Strings are not equal")
    }
  println(ansCheck1)

    val wordCheck3 = "Love Me Love Me Say That You Love Me"

    val wordCheck4 = "love me love me say that you love me"

    val ansCheck2 = wordCheck3.equals(wordCheck4, ignoreCase = true)

    if(ansCheck2){
        println("String sentences are equal")
    }else{
        println("String sentences are not equal")
    }
    println(ansCheck2)

    // toString() Function

    val numericalVal = 15997566

    val stringVal = numericalVal.toString();

    val addString = "7878"

    println(stringVal+addString)

    // isEmpty() string function

    val myString1 = "Hello Everyone!"

    val checkEmpty1 = myString1.isEmpty()

    if(checkEmpty1){
        println("The string is empty")
    }else{
        println("The string is not empty")
    }
    println(checkEmpty1)

    val myString2 = ""

    val checkEmpty2 = myString2.isEmpty()

    if(checkEmpty2){
        println("The string is empty")
    }else{
        println("The string is not empty")
    }
    println(checkEmpty2)

    //isNotEmpty() string function

    val checkString1 = "Hello Everyone!"

    val checkEmptyString1 = myString1.isNotEmpty()

    if(checkEmptyString1){
        println("The string is not empty")
    }else{
        println("The string is empty")
    }
    println(checkEmptyString1)

    val checkString2 = ""

    val checkEmptyString2 = myString2.isNotEmpty()

    if(checkEmptyString2){
        println("The string is not empty")
    }else{
        println("The string is empty")
    }
    println(checkEmptyString2)

    // startsWith() string function

    val startCheck1 = "Hello World!";

    val startsWithCheck1 = startCheck1.startsWith("Hello")

    if(startsWithCheck1){
        println("The sentence starts with Hello")
    }else{
        println("The sentence does not starts with Hello")
    }
    println(startsWithCheck1)

    val startCheck2 = "Hello World!";

    val startsWithCheck2 = startCheck2.startsWith("hello")

    if(startsWithCheck2){
        println("The sentence starts with Hello")
    }else{
        println("The sentence does not starts with Hello")
    }
    println(startsWithCheck2)

    val startCheck3 = "Hello World!";

    val startsWithCheck3 = startCheck3.startsWith("hello", ignoreCase = true)

    if(startsWithCheck3){
        println("The sentence starts with Hello")
    }else{
        println("The sentence does not starts with Hello")
    }
    println(startsWithCheck3)

    //endsWith() string function

    val endCheck1 = "Hello World!"

    val endsWithCheck1 = endCheck1.endsWith("World!")

    if(endsWithCheck1){
        println("The sentence ends with World")
    }else{
        println("The sentence does not ends with World")
    }

    println(endsWithCheck1);

    val endCheck2 = "Hello World!"

    val endsWithCheck2 = endCheck2.endsWith("world!")

    if (endsWithCheck2){
        println("The sentence ends with World")
    }else{
        println("The sentence does not ends with World")
    }
    println(endsWithCheck2)

    val endCheck3 = "Hello World!"

    val endsWithCheck3 = endCheck3.endsWith("world!", ignoreCase = true)

    if(endsWithCheck3){
        println("The sentence ends with World")
    }else{
        println("The sentence does not ends with World")
    }
    println(endsWithCheck3)

    //substring() string function

    val substringCheck1 = "My ambition is to be a Businessman"

    val ansSubstring1 = substringCheck1.substring(15)

    val ansSubstring2 = substringCheck1.substring(3,15)

    println(ansSubstring1)

    println(ansSubstring2)

    println(ansSubstring2+ansSubstring1)

    // toUpperCase string function

    val checkUpper1 = "Hello Kotlin!"
   // most used
    val ansToUpper1 = checkUpper1.uppercase(Locale.getDefault());

    val checkUpper2 = "hello kotlin!"
   // less used
    val ansToUpper2 = checkUpper2.toUpperCase()

    println(ansToUpper1)

    println(ansToUpper2)

   // toLowerCase() string function

    val checkLower1 = "Hello Android!"
    // most used
    val ansToLower1 = checkLower1.lowercase(Locale.getDefault())
    // less used
    val checkLower2 = "hello android!"

    val ansToLower2 = checkLower2.toLowerCase();

    println(ansToLower1)
    println(ansToLower2)

    // trim() function

    val originalString1 = "   " + "  Kotlin is awesome!   "

    val trimmedString1 = originalString1.trim()

    println(trimmedString1)

    val originalString2 = "***Kotlin ** is ** Awesome!***"

    // Remove asterisks from both ends
    val trimmedString2 = originalString2.trim('*')

    println(trimmedString2) // Output: "Kotlin ** is ** Awesome!"

    val originalString3 = "---Kotlin is Amazingly good and it is fun coding language---"

   // Remove hyphens and " is fun" from both ends
    val trimmedString3 = originalString3.trim('-',' ','a','n','d',' ','i','t',' ','i','s',' ','f','u','n',' ','c','o','d','i','n','g',' ','l','a','n','g','u','a','g','e')

    println(trimmedString3)// Output: "Kotlin is Amazingly"

    //removePrefix() function

    val hyperlink1 = "https://www.apple.in"
    val finalLink1 = hyperlink1.removePrefix("https://")
    println(finalLink1)

    val intro1 = "My name is Amit"
    val finalIntro1 = intro1.removePrefix("My name is ")
    println(finalIntro1)

    //removeSuffix() function

    val hyperlink2 = "https://www.samsung.in/html/info"
    val finalLink2 = hyperlink2.removeSuffix("/html/info")
    println(finalLink2)

    val intro2 = "Amit Swain is my full name"
    val finalIntro2 = intro2.removeSuffix(" is my name")
    println(finalIntro2)

    // using removePrefix() and removeSuffix() together

    val hyperLink = "https://www.amazon.com/homepage/categories"
    val finalLink = hyperLink.removePrefix("https://").removeSuffix("/homepage/categories")
    println(finalLink)

    //spilt()

    val sentenceText = "This is the split function test"
    val testSplit = sentenceText.split(" ")
    println(testSplit)
    var splitNum = 1
    for(i in testSplit) {
        println("The word number $splitNum is $i")
        splitNum++;
    }
        val text = "apple,banana,cherry,dates"
        val fruits = text.split(' ', limit = 3) // Split into three parts
         println(fruits)
        for (fruit in fruits) {
            println(fruit)
        }

    val fruitText = "apple,banana,cherry"
    val fruitsString = fruitText.split(',') // Split by comma

    for (fruit in fruitsString) {
        println(fruit)
    }

    // toInt(), toFloat(), toDouble()

    val stringInteger = "45180745"

    val ansInteger = stringInteger.toInt()

    println(ansInteger)

    println(ansInteger+5)

    val stringFloat = "897.67"

    val ansFloat = stringFloat.toFloat()

    println(ansFloat)

    println(ansFloat+ 65.73)

    val stringDouble = "3.14"

    val ansDouble = stringDouble.toDouble()

    println(ansDouble)

    println(ansDouble+6.35)

    // replace string function

    val replaceString = "Hello Kotlin, Hello Android"

    val ansReplace = replaceString.replace("Hello","Hi!")

    println(ansReplace)

    // format function

    val name = "Amit"

    val age = 25

    val formattedString1 = "Hello, %s! You are %d years old.".format(name, age)

    println(formattedString1)

    val price = 499.9974
    val quantity = 4

    val formattedString2= "Total cost: $%.3f for %d items.".format(price, quantity)

    println(formattedString2)

   // contains function

    val containsString = "This the Kotlin Programming language"

    val checkContainsString = containsString.contains("Kotlin")

    if(checkContainsString){
        println("It contains Kotlin")
    }else{
        println("It does not contains Kotlin")
    }

    println(checkContainsString)

    // matches string function

    val textMatches = "Hello, Kotlin!"

    val pattern = "[A-Za-z,\\s]+".toRegex() // Regular expression pattern

    val isMatch = textMatches.matches(pattern)

    if (isMatch) {
        println("The string matches the pattern.")
    } else {
        println("The string does not match the pattern.")
    }
}