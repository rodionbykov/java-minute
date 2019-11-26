package javaminute.kotlin

fun main(args: Array<String>){

    // init new object
    // notice no new keyword
    val bob = Person()
    bob.name = "Robert"
    bob.age = 32
    bob.salary = 60000.00

    println("User name is ${bob.name}, he's ${bob.age}, and earning ${bob.salary}")

    // adding extension function to class Person
    fun Person.about(){
        println("User name is ${this.name}, he's ${this.age}, and earning ${this.salary}")
    }
    // calling freshly added function
    bob.about();

    var dog = Dog("Alice", 3, false)
    // println(dog.age) // throws error as there's no property age

    var cat = Cat("Bob", 12, true)
    println("Cat is ${if (cat.sex) "male" else "female"}")
    println("Cat has name of ${cat.name}")
    println("Cat is ${cat.age} years old")

}
