package Module02_ObjectOrientation.Ex004_RPG

fun main () {

    val player = Character(name = "Noctis", hp = 100, atk = 30, def = 10)
    val enemy = Enemy("Behemoth", 150, 30, 10)
    val item = Item(name = "Small Potion", type = "potion", value = 100)
    println("${player.name} HP: ${player.hp} --|x|-- ${enemy.name}  HP: ${enemy.hp} \n")
    println("Choose an action: \n1. Attack \n2. Heal \n3. Run away \nAction: ")

    while (player.hp > 0 && enemy.hp > 0) {

        var choice = readLine()
        when (choice) {
            "1" -> player.attack(enemy)
            "2" -> item.use(player)
            "3" -> {
                println("You ran away!")
                break
            }
            else -> println("Invalid choice")
        }
        enemy.attack(player)
        println("${player.name} HP: ${player.hp} --|x|-- ${enemy.name}  HP: ${enemy.hp} \n")
        println("Action: ")
        if (player.hp <= 0) {
            println("${player.name} has been defeated!")
            break
        } else if (enemy.hp <= 0) {
            enemy.alive()
            println("${enemy.name} has been defeated!")
            break
        }
    }

}