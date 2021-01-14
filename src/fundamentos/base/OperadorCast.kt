package fundamentos.base

fun imprimirConceito (nota: Any){
    when(nota as? Int){
        10,9 -> "A"
        8,7 -> "B"
        6,5 -> "C"
        4,3 -> "D"
        2,1,0 -> "E"
        else -> println("Nota Inválida")
    }
}

fun main(args: Array<String>) {
    val notas: Array<Double>
    notas = arrayOf(9.3, 8.2, 7.1, 6.0)
    for (i in notas){
        imprimirConceito(i.toInt())
    }
}