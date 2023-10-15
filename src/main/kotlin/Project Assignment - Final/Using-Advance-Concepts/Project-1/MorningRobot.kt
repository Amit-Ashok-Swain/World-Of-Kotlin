package `Project Assignment - Final`.`Using-Advance-Concepts`.`Project-1`

class MorningRobot(val name: String) {
    private var alarmTime: String = ""
    private val daysToSkipAlarm: MutableSet<String> = mutableSetOf()
    private var coffeePreferences: MutableMap<String, Pair<Boolean, Int>> = mutableMapOf()
    private var waterTemperature: Int = 0
    private var timetable: MutableMap<String, List<String>> = mutableMapOf()
    private var mealPreferences: MutableMap<String, List<String>> = mutableMapOf()
    private var clothesToIron: String = ""

    // Constructor

    init {
        println("$name, your personal morning assistant, is ready!")
    }

    // Function to set the alarm

    fun setAlarm(time: String, daysToSkip: List<String>) {
        alarmTime = time
        daysToSkipAlarm.addAll(daysToSkip)
        println("Alarm set for $time. Skipping alarms on $daysToSkipAlarm.")
    }

    // Function to make coffee

    fun makeCoffee(withMilk: Boolean, sugarLevel: Int) {
        val coffeeType = if (withMilk) "with milk" else "black"
        coffeePreferences[getCurrentDayOfWeek()] = Pair(withMilk, sugarLevel)
        println("Making $coffeeType coffee with $sugarLevel spoons of sugar.")
    }

    // Function to heat water

    fun heatWater(temperature: Int) {
        waterTemperature = temperature
        println("Heating water to $temperature°C.")
    }

    // Function to pack bag based on timetable

    fun packBag(timetable: Map<String, List<String>>) {
        this.timetable = timetable.toMutableMap()
        val currentDay = getCurrentDayOfWeek()
        val booksToPack = this.timetable[currentDay] ?: emptyList()
        println("Packing your bag for $currentDay with books: $booksToPack")
    }

    // Function to cook meals based on preferences

    fun cookMeals(preferences: Map<String, List<String>>) {
        mealPreferences = preferences.toMutableMap()
        val currentDay = getCurrentDayOfWeek()
        val breakfastOptions = mealPreferences["Breakfast"] ?: emptyList()
        val lunchOptions = mealPreferences["Lunch"] ?: emptyList()
        val breakfast = breakfastOptions.random()
        val lunch = lunchOptions.random()
        println("Cooking $breakfast for breakfast and $lunch for lunch on $currentDay.")
    }

    // Function to iron clothes

    fun ironClothes(outfit: String) {
        clothesToIron = outfit
        println("Ironing $outfit for you.")
    }

    // Helper function to get the current day of the week

    private fun getCurrentDayOfWeek(): String {
        val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        val todayIndex = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK)
        return daysOfWeek[todayIndex - 1]
    }
}