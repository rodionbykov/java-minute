package javaminute.kotlin

class Dog (name : String, age : Int, sex : Boolean) {

    // primary constructor
    // it has access to arguments, but they not stored anywhere else
    init{
        println("This ${if (sex) "male" else "female"} dog is named ${name} and is ${age} years old")
    }
}
