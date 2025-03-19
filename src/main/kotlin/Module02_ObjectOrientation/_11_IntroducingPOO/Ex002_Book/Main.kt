package Module02_ObjectOrientation._11_IntroducingPOO.Ex002_Book

fun main() {
    val theSecret = Book()
    theSecret.title = "The Secret"
    theSecret.author = "Rhonda Byrne"
    theSecret.year = 2006
    theSecret.printBookInfo()

    val redQueen = Book()
    redQueen.title = "Red Queen"
    redQueen.author = "Victoria Aveyard"
    redQueen.year = 2015
    redQueen.printBookInfo()
}