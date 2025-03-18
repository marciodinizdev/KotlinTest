package Module02_ObjectOrientation.Ex005_Product

class Product (
    val name: String,
    val price: Double,
    var quantity: Int
) {
    fun buy(amount: Int) {
        if (amount <= quantity) {
            quantity -= amount
            println("You bought $amount units of $name for $price each.")
        } else {
            println("Not enough stock to buy $amount units of $name.")
        }
    }
    fun deeDetails() {
        println("Product Name: $name")
        println("Price: $price")
        println("Quantity: $quantity")
    }
}