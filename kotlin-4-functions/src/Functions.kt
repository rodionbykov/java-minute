package javaminute.kotlin

// void function
fun helloWorld() : Unit{
    println("Hello World of functions")
}

// default values
fun calcWage(hoursWorked : Double = 160.0, hourlyRate : Double) : Double{
    return hoursWorked * hourlyRate;
}

// implied type
fun qube(x:Int) = x*x*x

// unknown number of arguments
fun sumUp(vararg values : Int) : Int{
    var result : Int = 0
    for(v in values)
        result += v
    return result
}

// nested or inner function
fun squareEquation(a : Double, b : Double, c : Double) : Pair<Double, Double>{
    fun discriminant(a : Double, b : Double, c : Double) : Double{
        return b*b-4*a*c
    }
    var rootDiscriminant = Math.sqrt(discriminant(a,b,c))
    var solution1 = (-b+rootDiscriminant)/(2*a)
    var solution2 = (-b-rootDiscriminant)/(2*a)
    return Pair(solution1, solution2)
}

// nested function with closure
fun squareEquationWithClosure(a : Double, b : Double, c : Double) : Pair<Double, Double>{
    fun discriminant() : Double{
        return b*b-4*a*c // will be closured from above scope
    }
    var rootDiscriminant = Math.sqrt(discriminant())
    var solution1 = (-b+rootDiscriminant)/(2*a)
    var solution2 = (-b-rootDiscriminant)/(2*a)
    return Pair(solution1, solution2)
}

// extension function with infix notation
infix fun Double.addTwice(secondOperand : Double) : Double{
    return this + secondOperand * 2
}
