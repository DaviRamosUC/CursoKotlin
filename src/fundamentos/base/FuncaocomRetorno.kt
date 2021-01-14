package fundamentos

fun soma (a:Int, b: Int = 1): Int{
    return a + b
}

fun main(args: Array<String>) {
    println(soma(2,3)) // O b não assume o valor padrão, ele é sobscrito
    println(soma(11))
}