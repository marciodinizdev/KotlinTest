package Module02_ObjectOrientation._11_IntroducingPOO.Ex001_Dog


fun main() {

    val dog = Dog("Márcio")
    dog.name = "Rex"
    dog.age = 3

    val dogSara = Dog("Sara")
    dogSara.name = "Mel"
    dogSara.age = 5

    dog.bark()
    dog.sayHi()
    dogSara.bark()
    dogSara.sayHi()

}