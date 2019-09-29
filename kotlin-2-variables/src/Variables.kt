fun main(args:Array<String>){
    var i:Int = 64
    var f:Float = 3.1415f
    var d:Double = 3.1415e10

    println(i)
    println(f)
    println(d)

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

}
