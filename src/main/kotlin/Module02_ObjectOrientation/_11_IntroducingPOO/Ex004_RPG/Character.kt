package Module02_ObjectOrientation._11_IntroducingPOO.Ex004_RPG

class Character (
    val name: String,
    var hp: Int,
    var atk: Int,
    val def: Int
) {

    var maxHP: Int = hp

    fun heal(amount: Int) {
        hp += amount
        // Garantir que a vida não ultrapasse o máximo
        if (hp > maxHP) {
            hp = maxHP
        }
        println("$name healed $amount HP! Current HP: $hp")
    }

    // Function attack
    fun attack(enemy: Enemy) {
        var damage = atk - enemy.def
        if (damage > 0) {
            enemy.hp = enemy.hp - damage
            println("$name attacks ${enemy.name} and deals $damage damage")
            println("${enemy.name} HP: ${enemy.hp}")
        } else {
            println("${enemy.name} defends the attack")

        }
    }

    // Function take damage
    fun takeDamage(damage: Int) {
        var enemyDamage = damage - def
        if (enemyDamage > 0) {
            hp = hp - enemyDamage
            println("$name takes $enemyDamage damage")
        } else {
            println("$name defends the attack")
        }
    }

    fun alive(): Boolean {
        if ( hp > 0) {
            return true
        } else {
            println()
            println("$name has been defeated!")
            println("Game over!")
            return false
        }
    }

}