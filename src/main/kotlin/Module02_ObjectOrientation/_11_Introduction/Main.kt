package Module02_ObjectOrientation._11_Introduction


fun main() {

    val dog = Dog()
    dog.name = "Rex"
    dog.age = 3

    println("Dog's name: ${dog.name}")
    println("Dog's age: ${dog.age}")
    println(dog.sayHi("Márcio"))
}