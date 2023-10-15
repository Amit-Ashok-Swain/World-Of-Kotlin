package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`1`.`Classes-and-Objects`.`1`.`Basics-of-Classes-and-Objects`

class Dog {
   var breed : String = "Siberian Husky"
   var color : String = "White"
   var age : Int = 2

   fun eat(){
       println("${breed}'s eats pedigree")
   }

    fun bark(){
        println("${breed}'s barks")
    }

    fun sleep(){
        println("${breed}'s sleep")
    }

    fun wagTail(){
        println("${breed}'s wags tail")
    }
}

fun main() {
    val dog1 = Dog()

    dog1.eat()
    dog1.bark()
    dog1.wagTail()
    dog1.sleep()

    dog1.breed = "German Shephard"
    dog1.color = "Brown"
    dog1.age = 3

    println("The breed of dog is ${dog1.breed}, whose color is ${dog1.color} is ${dog1.age} years old!")

}
