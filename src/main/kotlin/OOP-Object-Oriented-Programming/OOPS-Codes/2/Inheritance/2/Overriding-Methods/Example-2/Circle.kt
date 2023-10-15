package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`2`.Inheritance.`2`.`Overriding-Methods`.`Example-2`

class Circle : Shape() {
    override fun draw() {
        super.draw() // Call the overridden method in the superclass
        println("Drawing a circle")
    }
}