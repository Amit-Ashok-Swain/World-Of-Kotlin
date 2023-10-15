package `Project Assignment - Final`.`Using-Advance-Concepts`.`Project-2`

class Robot(private val name: String) {

    // Function to set the alarm
    fun ringAlarm(time: String, daysToSkip: List<String>) {
        println("$name is ringing the alarm at $time. Skipping alarms on ${daysToSkip.joinToString(", ")}")
    }

    // Function to make coffee
    fun makeCoffee(coffee: Coffee) {
        println("$name is making ${coffee.type} coffee with ${coffee.sugarLevel} spoons of sugar.")
    }

    // Function to heat water
    fun heatWater(temperature: Int) {
        println("$name is heating water to $temperature°C.")
    }

    // Function to pack your bag
    fun packBag(booksToPack: ArrayList<String>) {
        /*  println("$name is packing your bag with books: ${booksToPack.joinToString(", ")}")

         */
        val subject1 = booksToPack.random()
        val subject2 = booksToPack.random()
        val subject3 = booksToPack.random()
        println("$name is packing your bag with books: ${subject1},${subject2},& ${subject3}.")
    }

    // Function to cook breakfast and lunch
    fun cookMeals(breakfastOptions: ArrayList<String>, lunchOptions: ArrayList<String>) {
        val breakfast = breakfastOptions.random()
        val lunch = lunchOptions.random()
        println("$name is cooking $breakfast for breakfast and $lunch for lunch.")
    }

    // Function to iron clothes
    fun ironClothes(outfit: String) {
        println("$name is ironing $outfit for you.")
    }
}