package Module02_ObjectOrientation.Ex004_RPG

class Item (
    val name: String,
    val type: String,
    val value: Int
) {

    // if item is a weapon, increase character's attack by value
    // if item is a potion, increase character's hp by value
    fun use(character: Character) {
        if (type == "weapon") {
            character.atk += value
        } else if (type == "potion") {
            character.heal(value)
        } else {
            println("Invalid item type")
        }
    }


}