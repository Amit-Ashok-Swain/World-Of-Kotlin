package `OOP-Object-Oriented-Programming`.`Coding-Practice`.`2`.Inheritance.`Coding-Practice-2`

// Child class 2
class Honda : Car("Honda", "Red") {
    fun sportMode() {
        speedUp(50) // Hondas have a sport mode that accelerates faster
        println("$brandName Car is in sport mode!")
    }
}