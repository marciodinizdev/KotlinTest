package Module02_ObjectOrientation.Ex004_RPG

import Module02_ObjectOrientation.Ex004_RPG.Character

class Enemy (
    val name: String,
    var hp: Int,
    val atk: Int,
    val def: Int,

) {

    fun attack(character: Character) {
        var damage = atk - character.def
        if (damage > 0) {
            character.hp = character.hp - damage
            println("$name attacks ${character.name} and deals $damage damage")
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
            return false
        }
    }

}