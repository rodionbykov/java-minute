package javaminute.kotlin

class Animal(var name : String){
    companion object Factory{ // companion object name can be omitted, it be defaulted to Companion
        fun create(name : String): Animal = Animal(name)
    }
}
