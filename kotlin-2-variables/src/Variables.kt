fun main(args:Array<String>){

    // constant
    val PI: Double = 3.1415

    // variable
    var circumference: Double = 0.0
    circumference = PI * 5
    println(PI);
    println(circumference);

    // numbers
    var i:Int = 64
    var l:Long = 2384723L
    var f:Float = 3.1415f
    var d:Double = 3.1415e10 // or just 123.45

    println(i)
    println(l)
    println(f)
    println(d)

    // ranges
    var ira:IntRange = 1..10
    var irb:IntRange = 1.rangeTo(10)
    var er:IntRange = 10..1
    var ipa:IntProgression = ira.reversed()
    var ipb:IntProgression = 100 downTo 1 step 5

    for(x in ira) println(x) // 1 to 10
    for(x in irb) println(x) // 1 to 10
    for(x in er) println(x) // nothing
    for(x in ipa) println(x) // 10 to 1
    for(x in ipb) println(x) // 100 to 5

    // arrays
    var names: Array<String> = arrayOf("Joshua", "Jane", "Jack")
    println(names[0]) // Joshua
    names[2] = "John"
    println(names[2]) // John
    println(names.toList()) // Joshua, Jane, Jack

    var numbers: IntArray = intArrayOf(3, 210, 44)
    println(numbers[0])
    println(numbers.toList()); // 3, 210, 44

    // characters
    var c:Char = 'a' // it should be single quotes
    var nc:Char = '\u0061'
    println(c)
    println(nc)
    println(c == nc)

    // strings
    var s: String = "This is one-line string"
    var raw: String = """ some
weird multiline ~~~ 
        string
    """
    var trimmed_raw: String = """
        |this
        | will be 
        |trimmed down
    """.trimMargin() // margin marked by pipe symbol by default

    println(s)
    println(raw)
    println(trimmed_raw)

    // string templates
    var price: Double = 25.99
    var price_label: String = "Today's price: ${'$'}${price}" // dollar sign has to be inserted as character
    println(price_label)

    // null values
    var nullable_string: String? = null // String is not nullable, but String? is
    var len: Int? = nullable_string?.length
    println(len)
    nullable_string = "Hello World"
    len = nullable_string.length
    println(len)
    println(nullable_string!!.length) // turning off nullability, not recommended

    // flow typing - change type depending on flow
    if(nullable_string != null){
        println(nullable_string.length) // in this block nullability is also turned off
    }

}
