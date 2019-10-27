package javaminute.kotlin

fun main(args: Array<String>){

    val product : (Int,Int) -> Int = {x : Int, y : Int -> x*y}

    println("2x3=${product(2,3)}")

    val lst = 1..10
    // counting how many numbers in lst is greater than 3
    val cnt = lst.count{ x -> x > 3 } // filtering lambda function (predicate) is passed as a parameter to count() function
    // when lambda is passed as parameter, parenthesis could be omitted function({}) become just function{}
    println(cnt)

    val shorter = lst.count{it > 3} // if lambda has only one parameter, it could be replaced by keyword it
    println(shorter)

}