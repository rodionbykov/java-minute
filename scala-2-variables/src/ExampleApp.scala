object ExampleApp extends App {

  val PI = 3.1415 // immutable

  var r : Int = 0 // mutable
  var S : Double = 0
  var comment : String = ""

  // r = 2.5 // will give an error of type mismatch
  // S = "12" // will give an error of type mismatch
  // S = 12 // will successfully be converted to Double

  r = 2
  S = PI * r * r // square of a circle

  println(S)

}
