package javaminute.kotlin

class Employee (override var name : String, override var age : Int, override var salary : Double, var position : String ) : Person() {
    fun about(){
        println("Employee name is ${this.name}, ${this.age}, earning ${this.salary} as a ${this.position}")
    }
}
