package Module02_ObjectOrientation.Ex002_Book

class Book {
    // Attributes
    var author: String? = null
    var title: String? = null
    var year: Int? = null

    // Methods
    fun printBookInfo() {
        println("Autor: $author")
        println("Title: $title")
        println("Year: $year")
    }
}