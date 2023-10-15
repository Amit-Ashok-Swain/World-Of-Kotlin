package `Learner-Activity`

/*
Make functions for ‘timesThree’ and ‘timesFour’,
first with the block body and then with the expression body.
 */
fun main() {
    val num1 = 15
    val num2 = 7
  println(timesThree1(num1))
    println(timesThree2(num2))

    println(timesFour1(num1))
    println(timesFour2(num2))

}

// User-Defined Function block body
fun timesThree1(x : Int) : Int {
    return x*3
 }

fun timesFour1(x :Int) : Int{
    return x*4
}

// User-Defined Function expression body
fun timesThree2(x : Int) : Int = x*3

fun timesFour2(x: Int) : Int = x*4


