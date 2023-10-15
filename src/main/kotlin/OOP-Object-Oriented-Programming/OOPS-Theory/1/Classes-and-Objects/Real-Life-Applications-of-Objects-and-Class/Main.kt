package `OOP-Object-Oriented-Programming`.`OOPS-Theory`.`Real-Life-Applications-of-Objects-and-Class`

/*
Problem Statement - Create a class called "Restaurants".
This class will have three properties- 'name', 'rating' and 'costForOne'.
Create 5 objects of this class. Print out all the value of these object
 */

fun main() {

    val res1 = Restaurants("McDonald's", 4.1, 200)
    val res2 = Restaurants("Dominos", 3.9, 150)
    val res3 = Restaurants("Burger King", 4.0, 250)
    val res4 = Restaurants("Taco Bell", 4.1, 400)
    val res5 = Restaurants("Subway", 3.5, 300)

    var restaurantsList = mutableListOf(res1,res2,res3)

    restaurantsList.add(res4)
    restaurantsList.add(res5)

    for (res in restaurantsList){
        println(res)
    }

}
