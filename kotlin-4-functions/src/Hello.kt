package javaminute.kotlin

fun main(args: Array<String>){
    helloWorld()
    println(qube(5))
    println("monthly pay 1: ${calcWage(168.0, 33.00)}")
    println("monthly pay 2: ${calcWage(hourlyRate = 40.0)}")
    println(sumUp(1,2,3,4,5,6,7,8,9))

    // descructuring Pair into x1, x2
    var (x1,x2) = squareEquation(1.0, 10.0, 16.0) // or squareEquationWithClosure
    println("Soluntion is $x1, $x2")

    // infix function takes 2 arguments - left and right
    var sample = 10 downTo 1
    // custom infix function
    var infixsample = 10.0 addTwice 5.0
    println(infixsample)
}
