package Module02_ObjectOrientation._11_Topic01


fun main() {

    val dog = Dog()
    dog.name = "Rex"
    dog.age = 3

    val dogSara = Dog()
    dogSara.name = "Mel"
    dogSara.age = 5

    dog.bark()
    dog.sayHi("Márcio")
    dogSara.bark()
    dogSara.sayHi("Sara")

}