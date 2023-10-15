package `OOP-Object-Oriented-Programming`.`Learner-Activity`.SecondaryConstructor
/*
Write the program shown in the previous video and
create a secondary constructor and add the property ‘height’ along with ‘age’.
Also create its object.
Create a class ‘Person’ with the properties ‘first name’ and ‘last name’.
Create a function ‘greeting’ and greet each created ‘Person’ object
with the message “Hello ‘first name’ ‘last name’, welcome to Internshala Trainings!”
 */
class Person(var firstName : String, var lastName : String) {

    var height : Any? = null ?: "Not Available"
    var age : Any? = null ?: "Not Available"

    constructor(firstName: String, lastName: String, height: Double, age: Int) : this(firstName,lastName){
        this.height = height
        this.age = age
    }

    fun greeting(){
        println("Hello $firstName $lastName, welcome to Internshala Trainings!")
    }

}

fun main() {

    // with height and age properties
    var person1 = Person("Amit","Swain",5.7,25)
    var person2 = Person("Rahul","Roy",6.1,28)

    //without height and age properties
    var person3 = Person("Shree","Ram")
    var person4 = Person("Shree","Krishna")
    var person5 = Person("Shree","Mahakaal")

    //printing data
    println("---------------------------------------------------------------------------------------------------------------------")
    println("Welcome to person's data")
    println()
    person1.greeting()
    println("${person1.firstName} ${person1.lastName} has height of ${person1.height}'ft with age ${person1.age} years old")

    println()
    println("---------------------------------------------------------------------------------------------------------------------")


    println()
    person2.greeting()
    println("${person2.firstName} ${person2.lastName} has height of ${person2.height}'ft with age ${person2.age} years old")

    println()
    println("---------------------------------------------------------------------------------------------------------------------")


    println()
    person3.greeting()
    println("${person3.firstName} ${person3.lastName} has height of ${person3.height} with age ${person3.age}")

    println()
    println("---------------------------------------------------------------------------------------------------------------------")


    println()
    person4.greeting()
    println("${person4.firstName} ${person4.lastName} has height of ${person4.height} with age ${person4.age}")

    println()
    println("---------------------------------------------------------------------------------------------------------------------")


    println()
    person5.greeting()
    println("${person5.firstName} ${person5.lastName} has height of ${person5.height} with age ${person5.age}")

    println()
    println("---------------------------------------------------------------------------------------------------------------------")


}