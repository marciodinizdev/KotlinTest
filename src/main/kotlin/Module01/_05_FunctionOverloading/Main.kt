package Module01._05_FunctionOverloading

// Overloading is the ability to define multiple functions with the same name but different parameters.

fun main() {
    // Execute loginVerify function
    loginVerify("Ramon", "12345")
    loginVerify(12345, true)

    // Execute registerUser function
    registerUser()

}

// Function 1
fun loginVerify(username: String, password: String) {
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

// Function with default parameter value
// If not provided, use default values
fun registerUser(username: String = "Desconhecido", isAdmin: Boolean = false) {
    println("Registering user with username: $username")
    println("User is admin: $isAdmin")
}