package javaminute.kotlin

fun main(args: Array<String>){

    var a: Sequence<Int> = arrayOf(2,4,32,57,21,12,53,6,7,9,8).asSequence()
    println("Items total ${a.count()}")

}