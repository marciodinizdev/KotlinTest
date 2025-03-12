package Module01_Fundamentals._10_LoopWhile

// Exemple 1: Loop While
fun loopWhile() {

    var counter = 1
    while(counter < 6) {
        println("Loop While Number $counter")
        counter++
    }

}

// Exemple 2: Loop While Game Menu
fun gameMenu() {

    var option = 0
    while(option != 2) {
        println("Choose an option: (1) Start Game | (2) Exit")
        option = readLine()!!.toInt()

        if (option == 1) {
            println("Starting the game...")
        } else if (option == 2) {
            println("Exiting the game...")
        }
    }

}

// Exemple 3: Loop While with Break
fun whileBreak() {

    var option = 0
    while(true) {
        println("Choose an option: (1) Start Game | (2) Exit")
        option = readLine()!!.toInt()

        if (option == 1) {
            println("Starting the game...")
        } else {
            println("Exiting the game...")
            break
        }
    }

}

// Exemple 4: Do While Loop
fun doWhile() {

    do {
        println("I'm executed at least once")
    } while (false)

}


fun main() {
    doWhile()
}