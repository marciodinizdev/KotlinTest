package Module01._03_When

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
    when(month) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid month")
    }

}

// Exemple 3
fun checkMonthOptimized() {
    val month = 12
    val monthName = when(month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }
    println(monthName)
}

// Exemple 4
fun checkNames() {

    when(val name = "Peter") {
        "Madison", "Lana", "Emma" -> println("Hello, ${name}! You're a woman!")
        "Peter", "John", "Michael" -> println("Hello, ${name}! You're a man!")
        else -> println("Invalid name")
    }
}

// Call exemple
fun main() {

    checkNames()

}