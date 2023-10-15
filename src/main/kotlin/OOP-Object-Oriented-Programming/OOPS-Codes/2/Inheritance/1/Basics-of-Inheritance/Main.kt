package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`2`.Inheritance.`1`.`Basics-of-Inheritance`

import `OOP-Object-Oriented-Programming`.`OOPS-Codes`.Inheritance.Cats
import `OOP-Object-Oriented-Programming`.`OOPS-Codes`.Inheritance.Dogs

fun main() {

    val dog1 = Dogs(4,"White",true)
    val dog2 = Dogs(4,"Black",true)

    val cat1 = Cats(4,"Brown", true)
    val cat2 = Cats(4,"Orange tabby", true)

    println("Dogs ")
    println("--------------------------------------------")
    print("Dogs ")
    dog1.eat()
    print("Dos")
    dog1.sleep()
    dog1.bark()

    println("--------------------------------------------")
    print("Dogs ")
    dog2.eat()
    print("Dogs ")
    dog2.sleep()
    dog2.bark()

    println("--------------------------------------------")

    println("--------------------------------------------")
    print("Cats ")
    cat1.eat()
    print("Cats ")
    cat1.sleep()
    cat1.purr()

    println("--------------------------------------------")
    print("Cats ")
    cat2.eat()
    print("Cats ")
    cat2.sleep()
    cat2.purr()

    println("--------------------------------------------")

    println("--------------------------------------------")



}