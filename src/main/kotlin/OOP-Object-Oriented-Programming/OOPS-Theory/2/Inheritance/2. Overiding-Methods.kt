package `OOP-Object-Oriented-Programming`.`OOPS-Theory`.`2`.Inheritance

/*
In Kotlin, you can override methods from a superclass (or interface) in a subclass using the `override` keyword.
Here are the steps to override methods in Kotlin:

1. Define a Superclass:

   First, create a superclass with the method you want to override. For example:

   open class Shape {
       open fun draw() {
           println("Drawing a shape")
       }
   }


   In the example above, the `Shape` class has a method called `draw()` marked with the `open` keyword.
   The `open` keyword indicates that this method can be overridden in subclasses.

2. Create a Subclass:

   Next, create a subclass that inherits from the superclass.
   To override a method from the superclass, use the `override` keyword in the subclass:


   class Circle : Shape() {
       override fun draw() {
           println("Drawing a circle")
       }
   }


   In this example, the `Circle` class is a subclass of `Shape`.
   It overrides the `draw()` method and provides its own implementation.

3. Using the Subclass:

   You can now create instances of the subclass and call the overridden method:


   fun main() {
       val shape: Shape = Circle()
       shape.draw()
   }


   In this `main()` function, a `Circle` object is assigned to a variable of type `Shape`,
   and when you call the `draw()` method, the overridden `draw()` method in the `Circle` class is executed.
   This is an example of polymorphism.

Key points to remember about overriding methods in Kotlin:

 - The overridden method in the subclass must have the same name, parameter types, and return type as the method in the superclass.
 - You can use the `super` keyword in the subclass to call the overridden method in the superclass if needed.
 - In addition to `open` and `override`, you can use the `final` keyword to prevent further overriding of a method in a subclass.

Here's an example of how you can use the `super` keyword to call the overridden method in the superclass:

open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}

class Circle : Shape() {
    override fun draw() {
        super.draw() // Call the overridden method in the superclass
        println("Drawing a circle")
    }
}

fun main() {
    val shape: Shape = Circle()
    shape.draw()
}

This will output:


Drawing a shape
Drawing a circle

 */