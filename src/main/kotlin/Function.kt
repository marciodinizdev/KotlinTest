fun main() {

    helloWorld()
    sum(3, 4)
    operations(12, 4)

}

// Function without return
fun helloWorld() {
    println("Hello, World!")
    println("This is a test function.")
    println(1 + 2)
}

// Function with return
fun sum(a: Int, b: Int): Int {
    val result = a + b
    println("The sum of 3 and 4 is: $result")
    return result
}

// Function with functions
fun operations(a: Int, b: Int) {
    fun subtract(): Int {
        println("subtracting $a from $b: ${a - b}")
        return a - b
    }
    fun multiply(): Int {
        println("multiplying $a by $b: ${a * b}")
        return a * b
    }
    fun divide(): Int {
        println("dividing $a by $b: ${a / b}")
        return a / b
    }
    subtract()
    multiply()
    divide()
}