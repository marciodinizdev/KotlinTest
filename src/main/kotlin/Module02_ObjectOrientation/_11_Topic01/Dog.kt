package Module02_ObjectOrientation._11_Topic01

class Dog {

    var name: String? = null
    var age: Int? = null

    fun sayHi(ownerName: String) {
        println("Hi, $ownerName, my name is $name and I am $age years old!")
    }

    fun bark() {
        println("$name says: Woof!")
    }

}
