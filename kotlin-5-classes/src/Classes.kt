package javaminute.kotlin

fun main(args: Array<String>){

    // init new object
    // notice no new keyword
    val bob = Person()
    bob.name = "Robert"
    bob.age = 32
    bob.salary = 60000.00

    println("User name is ${bob.name}, he's ${bob.age}, and earning ${bob.salary}")
}
