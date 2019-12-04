package javaminute.kotlin

fun main(args: Array<String>){

    // init new object
    // notice no new keyword
    val bob = Person()
    bob.name = "Robert"
    bob.age = 32
    bob.salary = 60000.00

    println("User name is ${bob.name}, ${bob.age}, earning ${bob.salary}")

    // adding extension function to class Person
    fun Person.about(){
        println("User name is ${this.name}, ${this.age}, earning ${this.salary}")
    }
    // calling freshly added function
    bob.about();

    var dog = Dog("Alice", 3, false)
    // println(dog.age) // throws error as there's no property age

    var cat = Cat("Bob", 12, true)
    println("Cat is ${if (cat.sex) "male" else "female"}")
    println("Cat has name of ${cat.name}")
    println("Cat is ${cat.age} years old")

    var human = Human("John", 52)
    println(human.toString())

    var human2 = human.copy()
    println(human2.toString())

    // compare for equality
    println(human2.equals(human))

    // compare for referential equality
    println(human === human2)

    // destructuring - unpacking values from object into distinct variables
    var (humanName, humanAge) = human
    println("Name is $humanName and age is $humanAge")

    // build new Person using PersonFactory singleton
    var alice = PersonFactory.makePerson("Alice", 36, 100000.0)
    alice.about()

    var animal1 = Animal.Factory.create("Alice")
    var animal2 = Animal.create("Bob") // can omit companion object name

    println(animal1)
    println(animal2)

}
