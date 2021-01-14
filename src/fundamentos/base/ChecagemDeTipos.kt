package fundamentos.base

fun main(args: Array<String>) {
//    val valor = "ABC"
    val valor: Any = 123

    if (valor is String){
        println(valor)
    }else if (valor !is String){
        println("Não é uma String")
    }
}