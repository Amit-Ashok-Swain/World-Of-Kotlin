package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`1`.`Classes-and-Objects`.`2`.PrimaryConstructor


// # Primary Constructor

// Using Primary Constructor with init block of code and this function
/*
class Dogs(breed : String, color: String, age : Int){ // Constructor variables

    // Member/Local variables
    var breed:String
    var color:String
    var age:Int

    init {
        // this.memberVariables = ConstructorVariables
        this.breed = breed
        this.color = color
        this.age = age
    }

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
        println("${breed}'s wag your tail")
    }

}

*/

/*

// Using Primary Constructor using Join declaration and assignment without init block of code and 'this' function
class Dog(breed : String, color: String, age : Int){ // Constructor variables

    // Member/Local variables
    var breed:String = breed
    var color:String = color
    var age:Int = age

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
        println("${breed}'s wag your tail")
    }

}

 */


// Using Primary Constructor moving members to constructor without init block of code and 'this' function -> Most optimised
class Dogs(var breed: String, var color: String, var age: Int){ // Constructor variables

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

    var dog1 = Dogs("Siberian Husky", "White", 2)
    var dog2 = Dogs("Labrador", color = "Light-Brown", 1)
    var dog3 = Dogs("Pit-bull", color = "Black", 3)
    var dog4 = Dogs("German Shephard", "Dark-Brown", 4)

    println("----------------------------------------------------------------------------------------------------------------------")


    println("Dog 1 Information:")
    println("Breed: ${dog1.breed}")
    println("Color: ${dog1.color}")
    println("Age: ${dog1.age}")
    println("${dog1.breed} functionality : ")
    dog1.eat()
    dog1.bark()
    dog1.wagTail()
    dog1.sleep()

    println("----------------------------------------------------------------------------------------------------------------------")


    println("Dog 2 Information:")
    println("Breed: ${dog2.breed}")
    println("Color: ${dog2.color}")
    println("Age: ${dog2.age}")
    println("${dog2.breed} functionality : ")
    dog2.eat()
    dog2.bark()
    dog2.wagTail()
    dog2.sleep()

    println("----------------------------------------------------------------------------------------------------------------------")


    println("Dog 3 Information:")
    println("Breed: ${dog3.breed}")
    println("Color: ${dog3.color}")
    println("Age: ${dog3.age}")
    println("${dog3.breed} functionality : ")
    dog3.eat()
    dog3.bark()
    dog3.wagTail()
    dog3.sleep()

    println("----------------------------------------------------------------------------------------------------------------------")


    println("Dog 4 Information:")
    println("Breed: ${dog4.breed}")
    println("Color: ${dog4.color}")
    println("Age: ${dog4.age}")
    println("${dog4.breed} functionality : ")
    dog4.eat()
    dog4.bark()
    dog4.wagTail()
    dog4.sleep()

    println("----------------------------------------------------------------------------------------------------------------------")
}
