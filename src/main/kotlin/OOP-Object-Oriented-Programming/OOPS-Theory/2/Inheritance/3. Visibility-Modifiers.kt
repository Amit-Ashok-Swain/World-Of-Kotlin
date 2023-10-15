package `OOP-Object-Oriented-Programming`.`OOPS-Theory`.`2`.Inheritance

/*
 # What are visibility modifiers?
 -> Visibility modifiers are keywords that help us set the visibility or accessibility of variables, functions, classes,
    objects, constructors, properties, etc.

    Types of visibility modifiers in Kotlin
     - Public
     - Private
     - Protected
     - internal

  1. Public - Anything that is declared public is accessible everywhere in the project.

  2. Private - 1. A top-level function or class that is declared private can be accessed only within the file where it is declared.
               2. Any member function, constructor, or property that is declared private is visible only within the class where it is declared.

  3. Protected - 1. Any property or member function declared protected is visible or accessible only within the class or its subclasses where it has been declared.
                 2. A top level function cannot be declared protected. Only properties or member functions of a class can be declared protected.

  4. Internal - Anything declared internal is accessible only within the same module. A module is a set of files compiled together.


  # Reason for using the visibility modifier

  1. Public - Used for declaring functions.

  2. Internal - Used in large software, where multiple modules are present.

  3. Protected - When we need to hide data inside a class, we use this visibility modifier.

  4. Private - When we don't want another class to change the value of the variable of a class. This is also known as data hiding.


 */


/*


In Kotlin, visibility modifiers are keywords used to control the visibility of classes, functions, properties, and other declarations within your code. Kotlin provides four primary visibility modifiers:

1. Public (default):
   - Public is the default visibility modifier in Kotlin.
   - Declarations marked as public are visible everywhere. They can be accessed from any module, package, or class.
   - For example:

     class MyClass {
         fun myFunction() {
             // This function is public by default
         }
     }


2. **Internal**:
   - Internal declarations are visible only within the same module.
   - A module, in this context, typically refers to a group of Kotlin files compiled together (e.g., a project, a module within a project, or a Gradle/Maven module).
   - For example:

     internal class MyInternalClass {
         internal fun myFunction() {
             // This class and function are visible within the same module
         }
     }


3. **Protected**:
   - Protected declarations are visible within the same class and its subclasses.
   - This modifier is not applicable to top-level functions and properties, only to class members.
   - For example:

     open class MyBaseClass {
         protected fun myFunction() {
             // This function is visible in subclasses of MyBaseClass
         }
     }

     class MyDerivedClass : MyBaseClass() {
         fun anotherFunction() {
             myFunction() // Accessing the protected function from the subclass
         }
     }


4. **Private**:
   - Private declarations are visible only within the same file or class.
   - A private declaration is not accessible from any other class or file.
   - For example:

     class MyClass {
         private val myProperty = 42

         private fun myFunction() {
             // This property and function are visible only in this class
         }
     }


In addition to these four primary visibility modifiers, Kotlin also provides a visibility modifier called "internal" for top-level functions and properties. This means you can have top-level functions and properties that are visible only within the same module.

It's important to choose the appropriate visibility modifier to control the accessibility of your code based on your design and encapsulation requirements. Proper use of visibility modifiers helps create well-structured, maintainable code.

// Examples :

Certainly, here are more examples of each visibility modifier in Kotlin:

Public:

package mypackage

class PublicClass {
    fun publicFunction() {
        // This function is public and can be accessed from other packages
    }
}


Internal:

// ModuleA.kt
package modulea

internal class InternalClassA {
    internal fun internalFunctionA() {
        // This class and function are visible within the 'modulea' module
    }
}

// ModuleB.kt
package moduleb

fun accessInternalClassA() {
    val instanceA = InternalClassA() // Error: 'InternalClassA' is not visible
}

In the above example, `InternalClassA` is marked as internal in the 'modulea' module. When trying to access it from the 'moduleb' module, you'll get an error because it's not visible outside the 'modulea' module.

Protected:

open class MyBaseClass {
    protected val protectedProperty = 42

    protected fun protectedFunction() {
        // These properties and functions are visible within the class and its subclasses
    }
}

class MyDerivedClass : MyBaseClass() {
    fun anotherFunction() {
        val value = protectedProperty // Accessing protected property from the subclass
        protectedFunction() // Accessing protected function from the subclass
    }
}


In the above example, `protectedProperty` and `protectedFunction` in `MyBaseClass` are marked as protected. They can be accessed within the `MyBaseClass` class and its subclasses, such as `MyDerivedClass`.

Private:

class MyClass {
    private val myPrivateProperty = 42

    private fun myPrivateFunction() {
        // These properties and functions are visible only within the 'MyClass' class
    }
}

fun accessPrivateMembers() {
    val myInstance = MyClass()
    val value = myInstance.myPrivateProperty // Error: 'myPrivateProperty' is not visible
    myInstance.myPrivateFunction() // Error: 'myPrivateFunction' is not visible
}

In the above example, `myPrivateProperty` and `myPrivateFunction` are marked as private and are only accessible within the `MyClass` class. An attempt to access them from outside the class, as shown in `accessPrivateMembers()`, will result in errors.

Top-level Internal:

// ModuleA.kt
internal fun internalTopLevelFunction() {
    // This top-level function is only visible within the 'modulea' module
}

In this example, `internalTopLevelFunction` is a top-level function marked as internal, so it's only visible within the 'modulea' module where it is defined. It cannot be accessed from outside the module.
 */