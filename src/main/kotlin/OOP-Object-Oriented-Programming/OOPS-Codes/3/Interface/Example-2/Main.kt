package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`3`.Interface.`Example-2`

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    // Calculate and print the area and perimeter of the circle
    println("Circle - Area: ${circle.area()}, Perimeter: ${circle.perimeter()}")

    // Calculate and print the area and perimeter of the rectangle
    println("Rectangle - Area: ${rectangle.area()}, Perimeter: ${rectangle.perimeter()}")
}