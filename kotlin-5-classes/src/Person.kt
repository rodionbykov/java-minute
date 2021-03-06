package javaminute.kotlin

open class Person {
    // properties
    open var name : String = ""
    open var age : Int = 0
    // values to non-nullable type properties has to be assigned in declaration
    // implicit getters and setters are created

    // properties with explicit getter/setter
    // for example store salary in cents
    open var salary : Double = 0.0
        get() { return field / 100 }
        set(value) { field = value * 100 }

    // lateinit vars doesn't need to have initial value
    lateinit var address :String

}
