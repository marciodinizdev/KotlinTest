package Module02_ObjectOrientation._11_IntroducingPOO.Ex003_Calculator

class Calculator {

    fun sum(x: Int, y: Int): Int { return x + y }
    fun subtract(x: Int, y: Int): Int { return x - y }
    fun multiply(x: Int, y: Int): Int { return x * y }
    fun divide(x: Int, y: Int): Double {
        if (y == 0) {
            throw ArithmeticException("Division by zero is not allowed.")
        }
        return x.toDouble() / y
    }

}