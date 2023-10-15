package `OOP-Object-Oriented-Programming`.`OOPS-Theory`.`1`.`Classes-and-Objects`

/*
What is a Constructor?
A constructor is a special kind of member function that is used to initialise
the state or properties of the newly created objects of a class.

The constructor os written inside the class, but it gets invoked when you create
an instance of a class(Objects).

Constructor are required to create objects of a class.

Every class must always have a constructor.
 */

/*
Difference between Primary Constructors and Secondary Constructors
 # Primary Constructors
  - A class can have only one primary constructor.

  - The primary constructor is defined in the class header as part of the class declaration.
  - It is responsible for initializing the class properties and can include default values for constructor parameters.
  - If a class has a primary constructor, it must initialize the class properties.
  - The primary constructor is the preferred way to initialize a class in Kotlin, and it's often used for common initialization tasks.
/*
class Person(val name: String, val age: Int = 0) {
    // Class properties and methods can be defined here.
}

 */
 # Secondary Constructors
  - A class can have multiple secondary constructors.
  - Secondary constructors are defined using the constructor keyword within the class body.
  - They allow you to provide additional ways to construct an object by overloading the constructor with different parameter combinations.
  - Secondary constructors are not responsible for initializing class properties; that is typically done in the primary constructor.
  - They must call the primary constructor using the this keyword as their first statement or delegate to another secondary constructor defined in the same class using the this keyword.
/*
class Person {
    val name: String
    val age: Int

    constructor(name: String) {
        this.name = name
        this.age = 0 // Default age
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

 */
 */
