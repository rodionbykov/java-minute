package javaminute.kotlin

fun main(args: Array<String>){

    val product : (Int,Int) -> Int = {x : Int, y : Int -> x * y}

    println("2x3=${product(2,3)}")

    val lst = 1..10
    // counting how many numbers in lst is greater than 3
    val cnt = lst.count{ x -> x > 3 } // filtering lambda function (predicate) is passed as a parameter to count() function
    // when lambda is passed as parameter, parenthesis could be omitted function({}) become just function{}
    println(cnt)

    val shorter = lst.count{it > 3} // if lambda has only one parameter, it could be replaced by keyword it
    println(shorter)

    var collection = listOf(65, 12, 31, 72, 45, 20)
    // using high-order function to be passed as parameter of function
    var maxvalue = max(collection, {x, y -> x < y})
    println("Maximum value of list is $maxvalue")

    // receiver function - adding lambda as extension function
    var x : Int = 9
    val increaseBy = fun Int.(value : Int) = this + value
    println("$x + 3 = ${x.increaseBy(7)}")

    // using lambda as extension function for a type
    fun String.bracketize() : String {
        return "($this)"
    }
    var s : String = "hello"
    println("Write hello in brackets: ${s.bracketize()}")

    // simple class
    val a = Average()

    // call invoke function as class member function
    var avg1 = a.invoke(5.1,3.0,7.23,12.5,6.15,12.3334)
    println(avg1)

    // call invoke as operator
    var avg2 = a(7.15,3.1415,7.12,12.2,6.5,12.45)
    println(avg2)

}

// define a function that receive a collection and comparator function
// comparator function is defined with signature "take 2 arguments of type T and return a Boolean"
fun <T> max(collection : Collection<T>, islessthan : (T, T) -> Boolean) : T? {
    var max:T? = null // maybe type T maybe null
    for (i in collection) // just going through collection and compare each value with current max
        if(max == null || islessthan(max, i)) // using comparator function to compare
            max = i
    return max
}

class Average {
    // function with name "invoke" is a special function for expression "a()" or "a(arg)" or "a(vararg)"
    public operator fun invoke(vararg values : Double) : Double {
        var sum : Double = 0.0
        for (i in values)
            sum += i
        return sum / values.size
    }
}
