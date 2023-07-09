package programs

fun main(){
    val myString = "Hello World!"
    println(myString.length)
    println(myString.startsWith("He"))
    println(myString.startsWith("We"))
    println(myString.endsWith("d!"))
    println(myString.first())
    println(myString.last())
    println(myString.equals("Hello World!"))
}