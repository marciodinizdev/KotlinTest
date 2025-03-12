package Module02_ObjectOrientation._11_Introduction

class Dog {

    var name: String? = null
    var age: Int? = null

    fun sayHi(ownerName: String) {
        println("Hi, $ownerName, my name is $name and I am $age years old!")
    }

}
