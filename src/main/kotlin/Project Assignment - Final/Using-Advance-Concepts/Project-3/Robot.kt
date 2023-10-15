package `Project Assignment - Final`.`Using-Advance-Concepts`.`Project-3`

class Robot(val name: String) {

    // Alarm
    fun ringAlarm(alarmTime: String, skipDays: List<String>) {
        val currentDay = "Monday" // Replace with the actual current day
        if (currentDay !in skipDays) {
            println("$name rings the alarm at $alarmTime")
        }
    }

    // Coffee
    fun makeCoffee(preferences: CoffeePreferences) {
        val coffeeType = if (preferences.isBlack) "Black Coffee" else "Coffee with Milk"
        println("$name prepares $coffeeType with ${preferences.sugarAmount} sugar cubes")
    }

    // Water
    fun heatWater(temperature: Int, willBatheToday: Boolean) {
        if (willBatheToday) {
            println("$name heats water to $temperature°C for a refreshing bath")
        }
    }

    // Bag packing
    fun packBag(books: List<String>) {
        println("$name packs the following books for today: ${books.joinToString(", ")}")
    }

    // Cooking
    fun cookMeals(breakfastOptions: List<String>, lunchOptions: List<String>) {
        val breakfast = breakfastOptions.random()
        val lunch = lunchOptions.random()
        println("$name cooks $breakfast for breakfast and $lunch for lunch")
    }

    // Ironing
    fun ironClothes(clothes: List<String>) {
        println("$name irons the following clothes: ${clothes.joinToString(", ")}")
    }
}