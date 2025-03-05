package Module01._05_FunctionOverloading

// Overloading is the ability to define multiple functions with the same name but different parameters.

fun main() {
    // Execute loginVerify function
    loginVerify("Ramon", "12345")
    loginVerify(12345, true)
}

// Function 1
fun loginVerify(username: String, password: String) {
    println("Enter your username: ")
    val username = readLine() ?: "default"
    println("Enter your password: ")
    val password = readLine() ?: "default"
    if (username == "Ramon" && password == "12345") {
        println("Login successful!")
    } else {
        println("Login failed!")
    }
}

// Same name but different parameters
fun loginVerify(captcha: Int, isAdmin: Boolean) {
    if (captcha == 12345 && isAdmin) {
        println("Login successful!")
    } else {
        println("Login failed!")
    }
}