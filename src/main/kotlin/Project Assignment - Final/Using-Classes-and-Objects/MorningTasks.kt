package `Project Assignment - Final`.`Using-Classes-and-Objects`

// Class to represent the morning tasks
class MorningTasks {
    fun ringAlarm(alarmTime: String, skipDays: List<String>) {
        val currentDay = "Monday" // Replace with the actual current day
        if (currentDay !in skipDays) {
            println("Ring the alarm at $alarmTime")
        }
    }

    fun makeCoffee(preferences: CoffeePreferences) {
        val coffeeType = if (preferences.isBlack) "Black Coffee" else "Coffee with Milk"
        println("Prepare $coffeeType with ${preferences.sugarAmount} sugar cubes")
    }

    fun heatWater(temperature: Int, willBatheToday: Boolean) {
        if (willBatheToday) {
            println("Heat water to $temperature°C for a refreshing bath")
        }
    }

    fun packBag(books: List<String>) {
        println("Pack the following books for today: ${books.joinToString(", ")}")
    }

    fun cookMeals(breakfastOptions: List<String>, lunchOptions: List<String>) {
        val breakfast = breakfastOptions.random()
        val lunch = lunchOptions.random()
        println("Cook $breakfast for breakfast and $lunch for lunch")
    }

    fun ironClothes(clothes: List<String>) {
        println("Iron the following clothes: ${clothes.joinToString(", ")}")
    }
}