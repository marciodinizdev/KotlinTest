package Module01_Fundamentals._05_NamedParams

fun main() {

    // Execute ageVerify function
    ageVerify(18, "Paulo", false) // Implicit parameters
    ageVerify(age = 20, name = "Maria", isAdmin = true) // Explicit parameters
    ageVerify(name = "Ramon", isAdmin = false, age = 17) // Explicit parameters with reordered arguments

}

fun ageVerify(age: Int, name: String, isAdmin: Boolean) {
    println("Age: $age \nName: $name \nisAdmin? $isAdmin")
    if (age >= 18 && isAdmin) {
        println("$name can vote")
    } else {
        println("$name cannot vote")
    }
}