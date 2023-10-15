fun main() {
    startWithFunctionsWithReturnType()
    startWithFunctionsWithoutReturnType()
    startWithFunctionsWithExpressionBodyAndReturnType()
    startWithFunctionsWithExpressionBodyAndWithoutReturnType()

    val num = 18

    val num1 = 58

    val num2 = 68

    println(timesTwo(num))

    println(timesFive(num))

    println(findMax(num1,num2))
}
// 1] Functional Block Body

// User-defined function body with no arguments and with a return type
fun startWithFunctionsWithReturnType() : Unit{
    println("This is my first Function program with return type as Unit")
}
// User-defined function body with no arguments and without return type
fun startWithFunctionsWithoutReturnType(){
    println("This is my second Function program without any return-type")
}

// 2] Expression Body

// User-defined expression function body with no arguments and with a return type
fun startWithFunctionsWithExpressionBodyAndReturnType() : Unit = println("This is my third Function program with expression body and also with return type")

// User-defined expression function body with no arguments and without a return type
fun startWithFunctionsWithExpressionBodyAndWithoutReturnType() = println("This is my fourth Function program with expression body and without return type")

// User-defined function body
fun timesTwo(x: Int): Int {
    return x * 2
}

// User-defined expression body
fun timesFive(x:Int) : Int =  x * 5

// maxOf function to find maximum in two numbers

fun findMax(x:Int, y:Int):Int = maxOf(x,y)