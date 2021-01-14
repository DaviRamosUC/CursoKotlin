package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null //O ? significa que o a é null, ? == safe call operator

    println(a?.dec())
}