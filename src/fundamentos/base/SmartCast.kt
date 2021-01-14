package fundamentos.base

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any) {
    when (x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense a sua vida")
    }
}

fun main(args: Array<String>) {
    souEsperto("Davi")
    souEsperto2(10)
    souEsperto2(true)
}