package `OOP-Object-Oriented-Programming`.`OOPS-Codes`.`1`.`Classes-and-Objects`.`5`.`Real-Life-Applications-of-Objects-and-Classes`

/*
Problem Statement - Create a class called "Restaurants".
This class will have three properties- 'name', 'rating' and 'costForOne'.
Create 12 objects of this class. Print out all the value of these object
 */

fun main() {

    val res1 = Restaurants("Thai Tanic", 3.5, 250)
    val res2 = Restaurants("Lord of the wings", 4.8, 900)
    val res3 = Restaurants("Thai me up", 3.7, 200)
    val res4 = Restaurants("Nin Com Soup", 3.1, 600)
    val res5 = Restaurants("Life of Pie", 4.2, 250)
    val res6 = Restaurants("Indian Jones",4.1,300)
    val res7 = Restaurants("Wish you were beer", 3.9, 350)
    val res8 = Restaurants("Nacho daddy", 2.9, 100)
    val res9 = Restaurants("Bread Zeppelin", 4.4, 550)
    val res10 = Restaurants("Pastabilities", 3.7,400)
    val res11 = Restaurants("The dairy godmother", 4.8, 900)
    val res12 = Restaurants("Pour judgement",3.5,300)

    var restaurantsList = mutableListOf(res1,res2,res3)

    restaurantsList.addAll(listOf(res4,res5,res6,res7,res8,res9,res10,res11,res12))

    for (res in restaurantsList){
        println(res)
    }

}