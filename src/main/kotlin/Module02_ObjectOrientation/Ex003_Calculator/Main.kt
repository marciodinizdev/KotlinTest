package Module02_ObjectOrientation.Ex003_Calculator

fun main() {
    val calculator = Calculator()
    println("Sum: ${calculator.sum(5, 3)}")
    println("Subtract: ${calculator.subtract(5, 3)}")
    println("Multiply: ${calculator.multiply(5, 3)}")
    println("Divide: ${calculator.divide(5, 3)}")
}