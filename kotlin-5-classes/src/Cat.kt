package javaminute.kotlin

class Cat(var name: String, var age: Int, val sex: Boolean) {
    // with var and val keywords, arguments to constructor become object properties
    // primary constructor
    init {
        println("This ${ if (sex) "male" else "female"} cat named $name is $age years old")
    }

}
