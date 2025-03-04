fun main() {

    // IF / ELSE
    val product = "iPhone"
    if (product.length < 3) {
        println("Product is too short")
    } else {
        println("Product is long enough")
    }

    // VAR/VAL INPUT BY USER
    val userInput = readLine() ?: "default"
    if (userInput.length < 3) {
        println("$userInput is too short")
    } else {
        println("$userInput is long enough")
    }

}