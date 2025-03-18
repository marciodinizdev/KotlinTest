package Module02_ObjectOrientation.Ex004_RPG

fun gameStart() {

    // Characters
    val noctis = Character(name = "Noctis", hp = 100, atk = 30, def = 10)

    // Enemies
    val enemies = listOf(
        Enemy(name = "enemy", hp = 200, atk = 30, def = 10, exp = 100),
        Enemy(name = "Cactuar", hp = 150, atk = 25, def = 15, exp = 50),
        Enemy(name = "Tonberry", hp = 300, atk = 15, def = 10, exp = 200)
    )
    
    // Items
    val item = Item(name = "Small Potion", type = "potion", value = 100)
    
    // Start battle
    val enemy = enemies.random()
    
    println("Battle starts! Enemy: ${enemy.name} | HP: ${enemy.hp}")
    println("${noctis.name} HP: ${noctis.hp} ⚔\uFE0F ${enemy.name}  HP: ${enemy.hp} \n")
    println("Choose an action: \n1 -> Attack \n2 -> Heal \n3 -> Run away")

    while (noctis.alive() && enemy.alive()) {

        println("Action: ")
        var choice = readLine()
        when (choice) {
            "1" -> noctis.attack(enemy)
            "2" -> item.use(noctis)
            "3" -> {
                println("You ran away!")
                return
            }
            else -> println("Invalid choice")
        }
        if (enemy.hp > 0) {
            enemy.attack(noctis)
        }

    }
}