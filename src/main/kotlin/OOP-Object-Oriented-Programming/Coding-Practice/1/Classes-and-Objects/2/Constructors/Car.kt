package `OOP-Object-Oriented-Programming`.`Coding-Practice`.Constructors

/*
Create a class Car with brandName, color, and engineNumber as properties along with accelerate() and applyBrakes() as functions.
In the main function create multiple objects of this class Car.
 */

// Create class Car here

class Car(var brandName : String, var color : String, var engineNumber : String){

    var speed : Int? = null
    var timeTorque : Double? = null
    var timeToStop : Double? = null

    constructor(brandName : String, color : String, engineNumber : String, speed : Int, timeTorque : Double, timeToStop : Double) : this(brandName,color,engineNumber){
        this.speed = speed
        this.timeTorque = timeTorque
        this.timeToStop = timeToStop
    }

    fun accelerate(){
        println("The car accelerates with the speed of $speed kmphr within $timeTorque seconds.")
    }

    fun applyBrakes(){
        println("The car stops within ${timeToStop} seconds when brakes applied.")
    }

}

fun main(){

    // Create objects here
    val car1 = Car("Mercedes Benz","Black","EN0728001",160,10.23,5.81)
    val car2 = Car("BMW","White","EN0728002",185,9.15,4.32)
    var car3 = Car("Jaguar","Orange","EN0728003",205,10.57,4.89)
    var car4 = Car("Ferrari","Red","EN0728004",255,8.98,3.21)
    var car5 = Car("Lamborgini","Blue","EN0728005",280,12.8,3.15)

    //print
    println("-------------------------------------------")

    println("The Brand of car : ${car1.brandName}")
    println("The color of car : ${car1.color}")
    println("Engine Number of car : ${car1.engineNumber}")
    car1.accelerate()
    car1.applyBrakes()

    println("-------------------------------------------")

    println("The Brand of car : ${car2.brandName}")
    println("The color of car : ${car2.color}")
    println("Engine Number of car : ${car2.engineNumber}")
    car2.accelerate()
    car2.applyBrakes()

    println("-------------------------------------------")

    println("The Brand of car : ${car3.brandName}")
    println("The color of car : ${car3.color}")
    println("Engine Number of car : ${car3.engineNumber}")
    car3.accelerate()
    car3.applyBrakes()

    println("-------------------------------------------")

    println("The Brand of car : ${car4.brandName}")
    println("The color of car : ${car4.color}")
    println("Engine Number of car : ${car4.engineNumber}")
    car4.accelerate()
    car4.applyBrakes()

    println("-------------------------------------------")

    println("The Brand of car : ${car5.brandName}")
    println("The color of car : ${car5.color}")
    println("Engine Number of car : ${car5.engineNumber}")
    car5.accelerate()
    car5.applyBrakes()

    println("-------------------------------------------")
}

/*
class Car(val brandName: String, val color: String, val engineNumber: Int) {

   fun accelerate() = println("Car is speeding up. Zoom!")

   fun applyBrakes() = println("Brakes applied!!! Screetch!")

}

fun main() {

   val myI20 = Car("Hyundai", "Black", 2342)
   myI20.accelerate()
   myI20.applyBrakes()

   val myAmaze = Car("Honda", "White", 7786)
   myAmaze.accelerate()
   myAmaze.applyBrakes()

}
 */