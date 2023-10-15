package `OOP-Object-Oriented-Programming`.`OOPS-Theory`.`3`.Interface

/*
- Now we have learnt about inheritance. But in kotlin, a child class can only inherit from one parent class.

- We use interfaces to inherit from multiple parent classes.

 # Features of interfaces:
 - Interfaces are similar to classes, but they do not have a state. So, they do not have constructors as well.
 - They can have functions with or without default implementations. That is, the function definition may not necessarily have to be there,
 - They are declared by using the keyword 'interface'.

 In interface, we do not call it as Inheritance, but we call it as Implementation.
 The names are different to avoid confusion, but the concepts remain the same.
 */

/*
In Kotlin, interfaces are a fundamental part of the language and play a crucial role in defining contracts that classes must adhere to. An interface defines a set of abstract methods and properties that any class implementing the interface must provide concrete implementations for. Here's how you can work with interfaces in Kotlin:

1. Defining an Interface:

   You can define an interface using the `interface` keyword. Interface methods and properties are abstract by default, meaning they don't have implementations in the interface itself.


   interface MyInterface {
       fun doSomething()
       val property: Int
   }


2. Implementing an Interface:

   To implement an interface, a class uses the `:` symbol followed by the interface name. The class must provide concrete implementations for all the methods and properties defined in the interface.


   class MyClass : MyInterface {
       override fun doSomething() {
           println("Class is doing something")
       }
       override val property: Int = 42
   }


3. Interfaces with Default Implementations:

   In Kotlin, interfaces can also provide default implementations for methods. Classes implementing such interfaces can choose to override the default implementations if needed.


   interface MyInterface {
       fun doSomething()
       fun doSomethingElse() {
           println("Default implementation")
       }
   }


   A class can choose to override `doSomethingElse` or use the default implementation.

4. Multiple Interfaces :

   A class can implement multiple interfaces by separating them with commas.


   class MyClass : Interface1, Interface2 {
       // Implement methods and properties of both interfaces
   }


5.  Interface Delegation :

   In Kotlin, you can delegate an interface's implementation to another class using the `by` keyword. This is called "interface delegation."


   interface MyInterface {
       fun doSomething()
   }

   class AnotherClass : MyInterface {
       override fun doSomething() {
           println("AnotherClass is doing something")
       }
   }

   class MyClass : MyInterface by AnotherClass() {
       // MyClass delegates the implementation of doSomething to AnotherClass
   }


6. Using Interfaces :

   You can create instances of classes that implement an interface and call the interface's methods.


   val myInstance = MyClass()
   myInstance.doSomething()


7. Functional Interfaces :

   Kotlin interfaces can have a single abstract method. Such interfaces are sometimes referred to as functional interfaces, and they can be used with lambda expressions and function references.


   interface MyFunctionalInterface {
       fun doSomething()
   }

   val func: MyFunctionalInterface = { println("Lambda is doing something") }


Interfaces in Kotlin provide a powerful way to define contracts, enable code reuse, and implement multiple inheritance-like behavior. They are essential in building flexible and extensible software.
 */