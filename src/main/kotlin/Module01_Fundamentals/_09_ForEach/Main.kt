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

// Exemple 3: For with
fun forWithRange() {
    for (i in 0..names.lastIndex) {
        println("Index $i: ${names[i]}")
    }
}

fun main() {
    forWithRange()
}