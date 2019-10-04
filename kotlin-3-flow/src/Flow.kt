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

}