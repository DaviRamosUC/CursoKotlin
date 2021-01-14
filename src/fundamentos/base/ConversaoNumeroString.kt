package fundamentos

fun main(args: Array<String>) {
    val a = 1

//    Número para String
    println(a.toString()+1)
//    String para número
    println("1.3".toDouble()+3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)

//    Converter para o Inteiro
    println("1".toInt()+3)
}