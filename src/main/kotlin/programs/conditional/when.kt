package programs.conditional

fun main(){
    val password = "AD"
    println(password is String)
    println(password is Any)
    when {
        password == "" -> {
            println("Password can't be empty.")
        }
        password.length < 7 -> {
            println("Password is too short.")
        }
        else -> {
            println("Password is Ok")
        }
    }

    val txtTOShow = when {
        password == "" -> "Password can't be empty"
        password.length < 7 -> "Password is too short"
        else -> "Password is OK"
    }
    println(txtTOShow)
}