package Module01_Fundamentals._07_Lists

// Exemple 1: Imutable list
fun imutableList() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val element = numbers.get(1)
    println(element)
}

// Exemple 2: Mutable list
fun mutableList() {
    var fruits: MutableList<String> = mutableListOf("Apple", "Banana", "Cherry")
    println(fruits)
    fruits.add("Papaya")
    println("List + Papaya: $fruits")
    fruits.remove("Banana")
    println("List - Banana: $fruits")
    fruits.removeAt(2)
    println("List - Element ate index 2: $fruits")
}

// Exemple 3: List functions
fun listFunctions() {
    val names: List<String> = listOf("Alice", "Bob", "Charlie", "David", "Eve", "Frank")
    println(names.count()) // Count the number of elements in the list
    println(names.indexOf("Bob")) // Find the index of the first occurrence of "Bob"
    println(names.size) // Get the size of the list)
    println(names.isEmpty()) // Check if the list is empty
    println(names.first()) // Get the first element of the list
    println(names.last()) // Get the last element of the list)
    println(names.contains("Charlie")) // Check if the list contains "Charlie")
    println(names.asReversed()) // Reverse the list
    println(names.sorted()) // Sort the list
    println(names.sortedDescending()) // Sort the list in descending order
}

fun main() {
    listFunctions()
}