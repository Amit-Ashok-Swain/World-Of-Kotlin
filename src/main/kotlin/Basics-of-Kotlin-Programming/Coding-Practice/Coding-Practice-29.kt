package `Coding-Practice`

/*
Create a list which contains math function operators (+, -, *, /) as characters.
Iterate through this list and pass two variables along with the list item (operator) to a function and perform all the math functions on them.
Perform the operation corresponding to the character encountered by the iterator.
Given:
Index of + is 0
Index of - is 1
Index of * is 2
Index of / is 3
In case of division check if the divisor is 0 or not.
 */

fun main() {
    val operators = listOf('+', '-', '*', '/')
    val numbers = listOf(10, 5, 2)

    for (operator in operators) {
        val result = performOperations(numbers.get(0), numbers.get(0), operator)
        println("${numbers[0]} $operator ${numbers[2]} = $result")
    }
}

    fun performOperations(a: Int, b:Int, operator: Char) : Any {
        return when(operator){
            '+' -> a+b
            '-' -> a-b
            '*' -> a*b
            '/' -> {
                if(b!=0){
                    a/b
                }else if(b==0){
                    println("Error: Divison by zero")
                }else{
                    Double.NaN
                }
            }

            else ->{
                println("Error : Unknown operator")
                Double.NaN
            }

        }
    }
  /*
  fun main() {
   val operatorList = listOf('+', '-', '*', '/')
   for (i in operatorList) {
       val output = performOperation(100, 20, i)
       println("The output of the operation $i is $output")
   }
}

fun performOperation(a: Int, b: Int, operator: Char): Int {
   var c = 0
   if (operator == '+') {
       c = a + b
   }
   if (operator == '-') {
       c = a - b
   }
   if (operator == '*') {
       c = a * b
   }
   if (operator == '/') {
       if (b != 0) {
           c = a / b
       } else {
           c = 0
       }
   }
   return c
}
   */