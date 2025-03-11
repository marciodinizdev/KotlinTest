package Module01._06_When

// Exemple  1
fun checkAge() {
    val age = 25
    when {
        age < 18 -> {
            println("You are a minor")
        }
        age >= 18 && age < 65 -> {
            println("You are an adult")
        }
        else -> {
            println("You are a senior")
        }
    }
}

// Exemple 2
fun checkMonth() {
    val month = 2

}

// Call exemple
fun main() {

    checkAge()

}