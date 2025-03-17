package Module02_ObjectOrientation.Ex004_RPG

fun main () {

    val noctis = Character(name = "Noctis", hp = 100, atk = 30, def = 10)
    val behemoth = Enemy("Behemoth", 150, 30, 10, 150)
    val item = Item(name = "Small Potion", type = "potion", value = 100)
    println("${noctis.name} HP: ${noctis.hp} --|x|-- ${behemoth.name}  HP: ${behemoth.hp} \n")
    println("Choose an action: \n1. Attack \n2. Heal \n3. Run away")

    while (noctis.alive() && behemoth.alive()) {

        println("Action: ")
        var choice = readLine()
        when (choice) {
            "1" -> noctis.attack(behemoth)
            "2" -> item.use(noctis)
            "3" -> {
                println("You ran away!")
                return
            }
            else -> println("Invalid choice")
        }
        if (behemoth.hp > 0) {
            behemoth.attack(noctis)
        }

    }

}