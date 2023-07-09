package programs.conditional

// Inside if-else bodies, you can include more than one statement.
// The value returned by a body is the last expression it has.

fun main() {
    val haveSomeExtraMoney = true
    val tip: Double =
        if (haveSomeExtraMoney) {
            println("Here you go") // Here you go
            1.0 // this value is ignored, because it is not the last one
            5.0 // this value is ignored, because it is not the last one
            10.0 // this is also ignored
            15.0
        } else {
            println("Sorry, I am broke")
            0.0
        }
    println(tip) // 10.0
}