package Module02_ObjectOrientation.Ex004_RPG

class Character (
    val name: String,
    var hp: Int,
    val atk: Int,
    val def: Int
) {

    // Function attack
    fun attack(enemy: Enemy) {
        var damage = atk - enemy.def
        if (damage > 0) {
            enemy.hp = enemy.hp - damage
            println("$name attacks ${enemy.name} and deals $damage damage")
        } else {
            println("${enemy.name} defends the attack")

        }
        println("Enemy HP: ${enemy.hp}")
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

    fun potion(hpHealed: Int) {
        hp += 100
        println("$name uses POTION and heals $hpHealed HP")
        println("HP: $hp")
    }

    fun alive(): Boolean {
        if ( hp > 0) {
            return true
        } else {
            return false
        }
    }

}