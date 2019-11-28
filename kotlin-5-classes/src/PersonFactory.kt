package javaminute.kotlin

// specifying object instead of class keyword makes a singleton instance
object PersonFactory {
    fun makePerson(name : String, age : Int, salary : Double) : Person {
        var result = Person()
        result.name = name
        result.age = age
        result.salary = salary

        return result
    }
}
