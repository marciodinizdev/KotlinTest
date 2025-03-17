package Module02_ObjectOrientation.Ex004_RPG

fun main () {
    val player = Character(name = "Noctis", hp = 100, atk = 20, def = 5)
    val enemy = Enemy("Behemoth", 150, 30, 10)
    println("${player.name} HP: ${player.hp} --|x|-- ${enemy.name}  HP: ${enemy.hp} \n")

    player.attack(enemy)

}