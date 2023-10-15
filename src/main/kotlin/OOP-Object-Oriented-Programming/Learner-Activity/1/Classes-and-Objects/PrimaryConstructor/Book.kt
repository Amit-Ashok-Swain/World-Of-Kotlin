package `OOP-Object-Oriented-Programming`.`Learner-Activity`.PrimaryConstructor
/*
Create a class named ‘Book’ with properties as ‘book name’, ‘genre’ and ‘publisher’ in the primary constructor
and create its objects in the main function.
 */
class Book(var bookName : String, var genre : String, var publisher : String) {

    fun booksByGenreFiction(){
        println("The list of Fictional Books : ")
    }

    fun booksByGenreMystery(){
        println("The list of Mystery Books : ")
    }

    fun booksByGenreClassic(){
        println("The list of Classic Books : ")

    }

    fun booksByGenreFantasy(){
        println("The list of Fantasy Books : ")
    }

    fun booksByGenreRomance(){
        println("The list of Romantic Books :")
    }

    fun booksByGenreYoungAdult(){
        println("The list of Young Adult Books :")
    }

    fun booksByGenreThriller(){
        println("The list of Thriller Books :")
    }
}

fun main() {

    //Fiction Books
    var book1 = Book("To Kill a Mockingbird", "Fiction", "HarperCollins")
    var book2 = Book("1984", "Science Fiction", "Penguin Books")
    var book3 = Book("The Alchemist", "Fiction", "HarperOne")
    var book4 = Book("The Catcher in the Rye", "Fiction", "Little, Brown and Company")
    var book5 = Book("The Martian", "Science Fiction", "Crown Publishing")

    //Mystery Books
    var book6 = Book("The Da Vinci Code", "Mystery", "Doubleday")
    var book7 = Book("The Girl with the Dragon Tattoo", "Mystery", "Vintage Crime/Black Lizard")

    //Classic Books
    var book8 = Book("Jane Eyre", "Classic", "Smith, Elder & Co.")
    var book9 = Book("The Great Gatsby", "Classic", "Scribner")
    var book10 = Book("Crime and Punishment", "Classic", "The Russian Messenger")

    //Fantasy Books
    var book11 = Book("Harry Potter and the Sorcerer's Stone", "Fantasy", "Bloomsbury")
    var book12 = Book("The Hobbit", "Fantasy", "George Allen & Unwin")
    var book13 = Book("The Lord of the Rings", "Fantasy", "George Allen & Unwin")
    var book14 = Book("The Night Circus", "Fantasy", "Doubleday")

    //Romance Books
    var book15 = Book("The Notebook", "Romance", "Warner Books")
    var book16 = Book("Pride and Prejudice", "Romance", "T. Egerton")

    //YoungAdult Books
    var book17 = Book("The Hunger Games", "Young Adult", "Scholastic")
    var book18 = Book("The Fault in Our Stars", "Young Adult", "Dutton Books")

    //Thriller Books
    var book19 = Book("The Silence of the Lambs", "Thriller", "St. Martin's Press")
    var book20 = Book("The Girl on the Train", "Thriller", "Riverhead Books")

    //Printing Book Store
    var bookNumbering = 1
while (true) {

    book1.booksByGenreFiction()
    println("Book No.$bookNumbering")
    println("The Book Name : ${book1.bookName}")
    println("The Genre of the Book : ${book1.genre}")
    println("The Publisher of the Book : ${book1.publisher}")
    println()
    bookNumbering++

    println("Book No.$bookNumbering")
    println("The Book Name : ${book2.bookName}")
    println("The Genre of the Book : ${book2.genre}")
    println("The Publisher of the Book : ${book2.publisher}")
    println()
    bookNumbering++

    println("Book No.$bookNumbering")
    println("The Book Name : ${book3.bookName}")
    println("The Genre of the Book : ${book3.genre}")
    println("The Publisher of the Book : ${book3.publisher}")
    println()
    bookNumbering++

    println("Book No.$bookNumbering")
    println("The Book Name : ${book4.bookName}")
    println("The Genre of the Book : ${book4.genre}")
    println("The Publisher of the Book : ${book4.publisher}")
    println()
    bookNumbering++

    println("Book No.$bookNumbering")
    println("The Book Name : ${book5.bookName}")
    println("The Genre of the Book : ${book5.genre}")
    println("The Publisher of the Book : ${book5.publisher}")
    println()
    bookNumbering++
    println("-----------------------------------------------------------------------------")
    println()


    book6.booksByGenreMystery()
    println("Book No.$bookNumbering")
    println("The Book Name : ${book6.bookName}")
    println("The Genre of the Book : ${book6.genre}")
    println("The Publisher of the Book : ${book6.publisher}")
    println()
    bookNumbering++

    println("Book No.$bookNumbering")
    println("The Book Name : ${book7.bookName}")
    println("The Genre of the Book : ${book7.genre}")
    println("The Publisher of the Book : ${book7.publisher}")
    println()
    bookNumbering++


    println("-----------------------------------------------------------------------------")
    println()


    book8.booksByGenreClassic()
    println("Book No.$bookNumbering")
    println("The Book Name : ${book8.bookName}")
    println("The Genre of the Book : ${book8.genre}")
    println("The Publisher of the Book : ${book8.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book9.bookName}")
    println("The Genre of the Book : ${book9.genre}")
    println("The Publisher of the Book : ${book9.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book10.bookName}")
    println("The Genre of the Book : ${book10.genre}")
    println("The Publisher of the Book : ${book10.publisher}")
    println()
    bookNumbering++


    println("-----------------------------------------------------------------------------")
    println()


    book11.booksByGenreFantasy()
    println("Book No.$bookNumbering")
    println("The Book Name : ${book11.bookName}")
    println("The Genre of the Book : ${book11.genre}")
    println("The Publisher of the Book : ${book11.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book12.bookName}")
    println("The Genre of the Book : ${book12.genre}")
    println("The Publisher of the Book : ${book12.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book13.bookName}")
    println("The Genre of the Book : ${book13.genre}")
    println("The Publisher of the Book : ${book13.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book14.bookName}")
    println("The Genre of the Book : ${book14.genre}")
    println("The Publisher of the Book : ${book14.publisher}")
    println()
    bookNumbering++


    println("-----------------------------------------------------------------------------")
    println()


    book11.booksByGenreRomance()
    println("Book No.$bookNumbering")
    println("The Book Name : ${book15.bookName}")
    println("The Genre of the Book : ${book15.genre}")
    println("The Publisher of the Book : ${book15.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book16.bookName}")
    println("The Genre of the Book : ${book16.genre}")
    println("The Publisher of the Book : ${book16.publisher}")
    println()
    bookNumbering++


    println("-----------------------------------------------------------------------------")
    println()


    book17.booksByGenreYoungAdult()
    println("Book No.$bookNumbering")
    println("The Book Name : ${book17.bookName}")
    println("The Genre of the Book : ${book17.genre}")
    println("The Publisher of the Book : ${book17.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book18.bookName}")
    println("The Genre of the Book : ${book18.genre}")
    println("The Publisher of the Book : ${book18.publisher}")
    println()
    bookNumbering++


    println("-----------------------------------------------------------------------------")
    println()


    book19.booksByGenreThriller()
    println("Book No.$bookNumbering")
    println("The Book Name : ${book19.bookName}")
    println("The Genre of the Book : ${book19.genre}")
    println("The Publisher of the Book : ${book19.publisher}")
    println()
    bookNumbering++


    println("Book No.$bookNumbering")
    println("The Book Name : ${book20.bookName}")
    println("The Genre of the Book : ${book20.genre}")
    println("The Publisher of the Book : ${book20.publisher}")
    println()

    println("-----------------------------------------------------------------------------")
    println()

    break
  }
}

// Books Example

/*
 "To Kill a Mockingbird", "Fiction", "HarperCollins"
   "1984", "Science Fiction", "Penguin Books"
 "The Great Gatsby", "Classic", "Scribner"
   "Harry Potter and the Sorcerer's Stone", "Fantasy", "Bloomsbury"
   "The Hobbit", "Fantasy", "George Allen & Unwin"
     "The Alchemist", "Fiction", "HarperOne"
 "The Da Vinci Code", "Mystery", "Doubleday"
    "The Catcher in the Rye", "Fiction", "Little, Brown and Company"
  "The Hunger Games", "Young Adult", "Scholastic"
   "The Martian", "Science Fiction", "Crown Publishing"
    "The Lord of the Rings", "Fantasy", "George Allen & Unwin"
    "The Notebook", "Romance", "Warner Books"
   "Pride and Prejudice", "Romance", "T. Egerton"
   "The Fault in Our Stars", "Young Adult", "Dutton Books"
   "The Girl with the Dragon Tattoo", "Mystery", "Vintage Crime/Black Lizard"
   "Jane Eyre", "Classic", "Smith, Elder & Co."
   "Crime and Punishment","Classic","The Russian Messenger"
   "The Night Circus", "Fantasy", "Doubleday"
   "The Silence of the Lambs", "Thriller", "St. Martin's Press"
   "The Girl on the Train", "Thriller", "Riverhead Books"
 */