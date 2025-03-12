package Module01_Fundamentals._08_LoopFor

// List
val names: List<String> = listOf (
    "Alice", "Bob", "Charlie", "David", "Eve", "Frank"
)

// Exemple 1: name in names
fun nameInNames() {
    for (name in names) {
        println(name)
    }
}

// Exemple 2: index in names
fun indexInNames() {
    for (index in names.indices) {
        print("Index $index: ")
        println(names[index])
    }
}

// Exemple 3: Getting name and index
fun getNameAndIndex() {
    for ((index, name) in names.withIndex()) {
        println("Index: $index, Name: $name")
    }
}

fun main() {
    getNameAndIndex()
}