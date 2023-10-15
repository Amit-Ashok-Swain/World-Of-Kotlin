package `OOP-Object-Oriented-Programming`.`Coding-Practice`.BasicOOPS

/*
  Create a class ‘Laptop’ with properties as RAM, brand and hard disk size.
  Also, create a function ‘performComputations’ in it.
  Create two different objects in the main function.
 */

/*
class Laptop {
    var ram : Int = 16
    var brand : String = "Apple"
    var hdd : String = "1TB"

    fun performComputationsApple(){
        println("The laptop named \"${brand} MacBook Pro\" has ${ram} GB RAM and ${hdd} SSD Storage with 16-core GPU, 16-core Neural Engine including 6 performance cores, 4 efficiency cores and 200GB/s memory bandwidth.")
    }

    fun performComputationsLenovo(){
        println("\"The laptop named \"${brand} IdeaPad 3 15ITL6\" has ${ram} GB RAM and ${hdd} SSD Storage with 11th Gen Intel(R) Core(TM) i3-1115G4 @3.00GHz and 64-bit operating system, x64-based processor.")
    }
}


fun main(){

    // Create object of class here
    var laptop = Laptop()
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputationsApple()

    laptop.ram = 8
    laptop.brand = "Lenovo"
    laptop.hdd = "256GB"
    laptop.performComputationsLenovo()

}
 */

class Laptop {
    var ram: Int = 4
    var brand: String = "Dell"
    var hdd: Int = 512

    fun performComputations(){
        println("I perform computations")
    }

    fun performComputationsLenovo(){
        println("\"The laptop named \"${brand} IdeaPad 3 15ITL6\" has ${ram} GB RAM and ${hdd}GB SSD Storage with 11th Gen Intel(R) Core(TM) i3-1115G4 @3.00GHz and 64-bit operating system, x64-based processor.")

    }

    fun performComputationsApple(){
        println("The laptop named \"${brand} MacBook Pro\" has ${ram} GB RAM and ${hdd}TB SSD Storage with 16-core GPU, 16-core Neural Engine including 6 performance cores, 4 efficiency cores and 200GB/s memory bandwidth.")

    }
}

fun main(){

    // Create objects here

    val laptop = Laptop()

    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()

    println("---------------------------------------------------")

    val laptop1 = Laptop()

    laptop1.ram = 8
    laptop1.brand = "Lenovo"
    laptop1.hdd = 256

    println(laptop1.ram)
    println(laptop1.brand)
    println(laptop1.hdd)
    laptop1.performComputationsLenovo()

   println("---------------------------------------------------")

    val laptop2 = Laptop()
    laptop2.ram = 16
    laptop2.brand = "Apple"
    laptop2.hdd = 1

    println(laptop2.ram)
    println(laptop2.brand)
    println(laptop2.hdd)
    laptop2.performComputationsApple()

    println("---------------------------------------------------")


}