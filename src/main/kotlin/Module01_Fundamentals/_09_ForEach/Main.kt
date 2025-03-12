package Module01_Fundamentals._09_ForEach

// List
val names: List<String> = listOf (
    "Alice", "Bob", "Charlie", "David", "Eve", "Frank"
)

// Exemple 1: For Each
fun forEachExample() {
    names.forEach {
        name -> println(name)
    }
}

// Exemple 2: For Each with index
fun forEachWithIndex() {
    names.forEachIndexed {
         i, name -> println("Index $i: $name")
    }
}

fun main() {
    forEachWithIndex()
}