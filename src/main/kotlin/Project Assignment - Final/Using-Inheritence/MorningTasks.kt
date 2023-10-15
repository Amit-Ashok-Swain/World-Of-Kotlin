package `Project Assignment - Final`.`Using-Inheritence`

// Base class for morning tasks
open class MorningTasks {
    open fun ringAlarm(alarmTime: String, skipDays: List<String>) {
        val currentDay = "Monday" // Replace with the actual current day
        if (currentDay !in skipDays) {
            println("Ring the alarm at $alarmTime")
        }
    }

    open fun makeCoffee(preferences: CoffeePreferences) {
        val coffeeType = if (preferences.isBlack) "Black Coffee" else "Coffee with Milk"
        println("Prepare $coffeeType with ${preferences.sugarAmount} sugar cubes")
    }

    open fun heatWater(temperature: Int, willBatheToday: Boolean) {
        if (willBatheToday) {
            println("Heat water to $temperature°C for a refreshing bath")
        }
    }

    open fun packBag(books: List<String>) {
        println("Pack the following books for today: ${books.joinToString(", ")}")
    }

    open fun cookMeals(breakfastOptions: List<String>, lunchOptions: List<String>) {
        val breakfast = breakfastOptions.random()
        val lunch = lunchOptions.random()
        println("Cook $breakfast for breakfast and $lunch for lunch")
    }

    open fun ironClothes(clothes: List<String>) {
        println("Iron the following clothes: ${clothes.joinToString(", ")}")
    }
}
