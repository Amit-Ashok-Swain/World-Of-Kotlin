package `OOP-Object-Oriented-Programming`.`Learner-Activity`.PrimaryConstructor
/*
Create class 'Clothes' with ‘material’, ‘colour’, and ‘price’ as properties in primary constructor
and create its objects in the main function.
 */
class Clothes(var material : String, var colour : String, var price : Double) {

    fun clothesDescriptionShirt(){
        println("Clothes Type : Shirt")
    }
    fun clothesDescriptionBottom(){
        println("Clothes Type : Trouser")
    }
    fun clothesDescriptionEthnicSaree(){
        println("Clothes Type : Saree")
    }
    fun clothesDescriptionEthnicKurti(){
        println("Clothes Type : Kurti")
    }
    fun clothesDescriptionPartyWear(){
        println("Clothes Type : Jacket")
    }
    fun clothesDescriptionFormals(){
        println("Clothes Type : Blazer")
    }

}

fun main() {
    var shirt1 = Clothes("Cotton", "Orange", 1999.99)
    var shirt2 = Clothes("Synthetic-Lycra","Yellow", 899.50)
    var trouser1 = Clothes("Denim", "Dark-Blue", 2999.0)
    var trouser2 = Clothes("Nylon", "Violet", 749.0)
    var ethnic1 = Clothes("Silk", "Red", 5000.0)
    var ethnic2 = Clothes("Cotton", "Cyan", 999.0)
    var partyWear1 = Clothes("Leather", "Brown", 9999.99)
    var partyWear2 = Clothes("Polyester", "White", 1299.65)
    var formals1 = Clothes("Wool-blends", "Black", 15000.0)
    var formals2 = Clothes("Linen", "Cream", 18645.20)

    var collection = 0
     while(true) {
         collection ++

        println("**********Shirt's Collection**********")
        println("Collection No.${collection}")
        shirt1.clothesDescriptionShirt()
        println("Clothes Material : ${shirt1.material}")
        println("Clothes colour : ${shirt1.colour}")
        println("Clothes price : ${shirt1.price}")

         println("------------------------------------------------")

        collection ++

        println("Collection No.${collection}")
        shirt2.clothesDescriptionShirt()
         println("Clothes Material : ${shirt2.material}")
         println("Clothes colour : ${shirt2.colour}")
         println("Clothes price : ${shirt2.price}")


        collection ++

         println("------------------------------------------------")
         println("------------------------------------------------")


         println("**********Trouser's Collection**********")
        println("Collection No.${collection}")
        trouser1.clothesDescriptionBottom()
         println("Clothes Material : ${trouser1.material}")
         println("Clothes colour : ${trouser1.colour}")
         println("Clothes price : ${trouser1.price}")

        collection ++

         println("------------------------------------------------")


         println("Collection No.${collection}")
        trouser2.clothesDescriptionBottom()
         println("Clothes Material : ${trouser2.material}")
         println("Clothes colour : ${trouser2.colour}")
         println("Clothes price : ${trouser2.price}")

        collection ++

         println("------------------------------------------------")
         println("------------------------------------------------")


         println("**********Party Wear's Collection**********")
        println("Collection No.${collection}")
        partyWear1.clothesDescriptionPartyWear()
         println("Clothes Material : ${partyWear1.material}")
         println("Clothes colour : ${partyWear1.colour}")
         println("Clothes price : ${partyWear1.price}")

        collection ++

         println("------------------------------------------------")


         println("Collection No.${collection}")
        partyWear2.clothesDescriptionPartyWear()
         println("Clothes Material : ${partyWear2.material}")
         println("Clothes colour : ${partyWear2.colour}")
         println("Clothes price : ${partyWear2.price}")

        collection ++

         println("------------------------------------------------")
         println("------------------------------------------------")



         println("**********Ethnic Wear's Collection**********")
        println("Collection No.${collection}")
        ethnic1.clothesDescriptionEthnicSaree()
         println("Clothes Material : ${ethnic1.material}")
         println("Clothes colour : ${ethnic1.colour}")
         println("Clothes price : ${ethnic1.price}")

        collection ++

         println("------------------------------------------------")


         println("Collection No.${collection}")
         ethnic2.clothesDescriptionEthnicKurti()
         println("Clothes Material : ${ethnic2.material}")
         println("Clothes colour : ${ethnic2.colour}")
         println("Clothes price : ${ethnic2.price}")

        collection ++

         println("------------------------------------------------")
         println("------------------------------------------------")



         println("**********Formal Wear's Collection(Blazers)**********")
        println("Collection No.${collection}")
        formals1.clothesDescriptionFormals()
         println("Clothes Material : ${formals1.material}")
         println("Clothes colour : ${formals1.colour}")
         println("Clothes price : ${formals1.price}")

        collection ++

         println("------------------------------------------------")


         println("Collection No.${collection}")
        formals2.clothesDescriptionFormals()
         println("Clothes Material : ${formals2.material}")
         println("Clothes colour : ${formals2.colour}")
         println("Clothes price : ${formals2.price}")

         println("------------------------------------------------")
         println("------------------------------------------------")
         break
    }

}