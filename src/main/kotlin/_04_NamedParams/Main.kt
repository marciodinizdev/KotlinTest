package _04_NamedParams

fun main() {

    // Functions execution
    ageVerify(18, "Paulo", false)
    ageVerify(20, "Renato", true)
    ageVerify(17, "Ramon", false)

}

fun ageVerify(age: Int, name: String, isAdmin: Boolean) {
    println("Age: $age \nName: $name \nisAdmin? $isAdmin")
    if (age >= 18 && isAdmin) {
        println("$name can vote")
    } else {
        println("$name cannot vote")
    }
}