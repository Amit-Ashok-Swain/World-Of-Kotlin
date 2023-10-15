package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`2`.Inheritance.`3`.`Visibility-Modifiers`

import `Coding-Practice`.difference
import `Coding-Practice`.sum

fun main() {
    val a = sum(10,20)
    val b = difference(30,15)
    val c = division(20,2)
  /*
    val prod = Product()
    prod.product(a,b) // Cannot access 'product': it is protected in 'Product'

   */

    println(a)
    println(b)
    println(c)
}

class Product {

    protected fun product(a: Int, b: Int) = a*b

}