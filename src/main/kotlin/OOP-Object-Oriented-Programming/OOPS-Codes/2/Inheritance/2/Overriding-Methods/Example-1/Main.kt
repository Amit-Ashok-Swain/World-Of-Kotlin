package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`2`.Inheritance.`2`.`Overriding-Methods`.`Example-1`

fun main() {

    val animal = Animals(null,null)
    val dog1 = Dogs(4, "White",true,true, "Tommy")
    val dog2 = Dogs(4,"Black", true,false,"Sam")
    val dog3 = Dogs(4,"Brown",false,true,"Rosy")
    val dog4 = Dogs(4,"Red",false,false,"Shiro")

    val cat1 = Cats(4,"White", true, "Leo")
    val cat2 = Cats(4,"Black",false,"Kitty")

    println("##########################################################################")
    println()

    animal.welcomeMessage()
    println()

    println("***************************************************************************")
    println()

    dog1.classificationMessage()
    println()

    println("Name of the dog: ${dog1.name}")
    println("${dog1.name} has ${dog1.legs} legs")
    println("${dog1.name} is ${dog1.color} in color")
    dog1.eat()
    dog1.smells()
    dog1.sound()
    dog1.sleep()
    println()
    println("---------------------------------------------------------------------------")
    println()


    println("Name of the dog: ${dog2.name}")
    println("${dog1.name} has ${dog2.legs} legs")
    println("${dog1.name} is ${dog2.color} in color")
    dog2.eat()
    dog2.smells()
    dog2.sound()
    dog2.sleep()
    println()
    println("---------------------------------------------------------------------------")
    println()


    println("Name of the dog: ${dog3.name}")
    println("${dog3.name} has ${dog3.legs} legs")
    println("${dog3.name} is ${dog3.color} in color")
    dog3.eat()
    dog3.smells()
    dog3.sound()
    dog3.sleep()
    println()
    println("---------------------------------------------------------------------------")
    println()


    println("Name of the dog: ${dog4.name}")
    println("${dog4.name} has ${dog4.legs} legs")
    println("${dog4.name} is ${dog4.color} in color")
    dog4.eat()
    dog4.smells()
    dog4.sound()
    dog4.sleep()
    println()
    println("---------------------------------------------------------------------------")
    println()

    println()
    println("***************************************************************************")
    println()

    cat1.classificationMessage()
    println()

    println("Name of the cat: ${cat1.name}")
    println("${cat1.name} has ${cat1.legs} legs")
    println("${cat1.name} is ${cat1.color} in color")
    cat1.eat()
    cat1.sound()
    cat1.sleep()
    println()
    println("---------------------------------------------------------------------------")
    println()


    println("Name of the cat: ${cat2.name}")
    println("${cat2.name} has ${cat2.legs} legs")
    println("${cat2.name} is ${cat2.color} in color")
    cat2.eat()
    cat2.sound()
    cat2.sleep()
    println()
    println("---------------------------------------------------------------------------")
    println()

    println()
    println("***************************************************************************")
    println()
    animal.thankYouMessage()
    println()
    println("##########################################################################")



}