package programs.basics

fun main(){
    var multiLine = """This is 
        |multiLine
        |Texts.
    """.trimMargin()
    println(multiLine)
}