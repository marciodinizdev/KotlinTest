package Module02_ObjectOrientation._11_IntroducingPOO.Ex004_RPG

class Enemy (
    val name: String,
    var hp: Int,
    val atk: Int,
    val def: Int,
    val exp: Int
) {

    fun attack(character: Character) {
        var damage = atk - character.def
        if (damage > 0) {
            character.hp = character.hp - damage
            println("$name attacks ${character.name} and deals $damage damage")
            println("${character.name} HP: ${character.hp}")
        } else {
            println("${character.name} defends the attack")
        }
    }

    fun takeDamage(damage: Int) {
        var playerDamage = damage - def
        if (playerDamage > 0) {
            hp = hp - playerDamage
            println("$name takes $playerDamage damage")
        } else {
            println("$name defends the attack")
        }
    }

    fun alive(): Boolean {
        if (hp > 0) {
            return true
        } else {
            println()
            println("$name has been defeated!")
            println("Exp gained: $exp")
            return false
        }
    }

}