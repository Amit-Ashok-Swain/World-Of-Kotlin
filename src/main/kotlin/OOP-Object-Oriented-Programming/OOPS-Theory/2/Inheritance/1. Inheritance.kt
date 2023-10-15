package `OOP-Object-Oriented-Programming`.`OOPS-Theory`.`2`.Inheritance

/*
We have learnt about Classes, Objects, Constructors, Data Classes.
But all the classes we have seen were mutually exclusive, i.e., two classes
were independent of each other, so we can say objects depend on classes, but
we haven't seen classes depending upon other classes. But now we are going to
look at classes that depend on other classes.

Now earlier we have a class called 'Dogs' and its objects were dogs of different
breeds.

But now let's say there is another class called 'Cats'.

 - The common properties of class 'Dogs' and class 'Cats' are as following:
     1. One Tail
     2. Four Legs
     3. Fur

 - The functions/behavior of class 'Dogs' are as following:
     1. eat()
     2. sleep()
     3. bark()

  - The functions/behavior of class 'Cats' are as following:
     1. eat()
     2. sleep()
     3. purr()

So we see that the properties are completely same for both the classes and two
functions like eat(), sleep() are common for both classes 'Dogs' and 'Cats'. The
function bark() in class 'Dogs' and function purr() in class 'Cats' are different.

So when we create classes for each, we will have to create the common functions
for both eat(), sleep() for twice i.e. one in class 'Dogs' and also in class 'Cats'.

Now to avoid doing re-work, what if we can create another class that can have the common
functions(i.e., eat() and sleep()) that are common to both the classes and then the classes
'Dogs' and 'Cats' can use these functions. It will save a lot of work for us.

Hence, for this we have the concept of Inheritance in Kotlin and Object-Oriented Programming
languages.

So we can create another class called 'Animals' here. Now let's simply the problems using
the class 'Animals'.

We can have the class 'Animals' which two common functions as eat() and sleep() and then the classes
'Dogs' and 'Cats' can use class 'Animals' for the functions.

Here, 'Animals' class is known as "Parent class/Base class/Superclass"
and the classes 'Dogs' and 'Cats' which will use the functions eat() and sleep() from the parent class 'Animals'
are known as "Child class/Derived class/Subclass.

Hence, child class inherits the function of parent class i.e., Classes 'Dogs' and 'Cats' inherits the functions of
class 'Animals'.

 - What is inheritance?
 -> Inheritance is one of the key concepts of Object-Oriented Programming(OOP). It enables re-usability, that is, it
 allows a class to inherit features (properties and behaviors) from another class.
 The class that inherits the features is called the child class, and the class whose features are inherited is called
 the parent class.

So for class 'Dogs' we inherit features of the parent class 'Animals' and we create another function called bark().
And for class 'Cats' we inherit the features of parent class 'Animals' and we create another function called purr().

Therefore, this makes our code cleaner, understandable and extendable.

# Points to remember
-> Whenever we create parent and child classes, each class should satisfy the condition:
   - Child class 'is a' Parent class.

   Examples:
   - Dogs are Animals.
   - Cats are Animals.

 ## Syntax for creating a parent class

 Syntax :

   Open class BaseClass(Properties of BaseClass)
   {...}

 Note - The keyword 'open' allows this class to be reusable.

 Example :

   Open class Animals (var legs: Int, var color: String) {.....}

 ## Syntax for creating a child class

 Syntax :

   class DerivedClass(Properties of BaseClass and properties of DerivedClass): BaseClass(Properties of BaseClass)
   {.....}

  Example :

   class Dogs (legs: Int, color: String): Animals(legs, fur){.....}

    */