fun main(args:Array<String>){

    var year: Int = 2001

    // if statement
    if(year % 4 == 0){
        println("${year} is a leap year")
    }else{
        println("${year} is not a leap year")
    }

    // curly brackets are optional
    if(year % 4 == 0)
        println("${year} is a leap year")
    else
        println("${year} is not a leap year")

    // if is also an expression, it could return value
    var message: String = if(year % 4 == 0) "${year} is a leap year" else "${year} is not a leap year"
    println(message)

    // in string expressions
    println("${year} ${if(year % 4 == 0) "is" else "is not"} a leap year");

    // iterating with for
    for(a in 1..10)
        println("$a")

    for(b in 10 downTo 1)
        println("$b")

    // iterating over a map
    val capitalcities = mapOf("Bruxelles" to "Belgium", "Berlin" to "Germany");
    for((city, country) in capitalcities)
        println("$city is a capital of $country")

    // switch expression
    var code = 48
    when (code){
        44 -> println("UK")
        48 -> println("Poland")
        49 -> println("Germany")
        39, 379 -> println("Vatican")
        in 1..999 -> println("Unknown") // executed if no match
        else -> println("Invalid") // not a numeric or not in range
    }

    // switch is also an expression returning value
    var country = when (code){
        44 -> "UK"
        48 -> "Poland"
        49 -> "Germany"
        39, 379 -> "Vatican"
        in 1..999 -> "Unknown" // executed if no match
        else -> "Invalid" // not a numeric or not in range
    }

    println("Code $code is for $country")
}
