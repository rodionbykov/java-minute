object ExampleApp extends App {

  val PI = 3.141592 // immutable

  var r : Int = 0 // mutable
  var S : Double = 0
  var comment : String = "Hello, "

  r = 2
  S = PI * r * r // square of a circle

  var message = comment + "Solo" + "!"

  var multilineMessage =
    """Some
      message
      on many
      lines
    """

  var resultingMessage = s"Square of circle of radius $r is $S."
  var resultingMessage2 = s"Square of circle of radius ${r}cm is ${S}sq.cm."

  var formattedMessage = f"Square of circle of radius $r%.2fcm is $S%.2fsq.cm."

  println(message)
  println(multilineMessage)
  println(resultingMessage)
  println(resultingMessage2)
  println(formattedMessage)

}
