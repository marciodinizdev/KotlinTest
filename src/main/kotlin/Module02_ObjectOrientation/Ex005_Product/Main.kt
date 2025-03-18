package Module02_ObjectOrientation.Ex005_Product

fun main() {
    var notebookDell = Product("Notebook Dell", 2000.00, 5)
    var smartphoneSamsung = Product("Smartphone Samsung", 1500.00, 10)

    notebookDell.buy(10)
    smartphoneSamsung.buy(8)

    notebookDell.deeDetails()
    smartphoneSamsung.deeDetails()
}