package fundamentos.operadores

fun main(args: Array<String>) {
    val trabalho1: Boolean = false
    val trabalho2: Boolean = false

    val comprouSorvete: Boolean = trabalho1 || trabalho2
    val comprouTV32: Boolean = trabalho1 && trabalho2
    val comprouTV50: Boolean = trabalho1 xor trabalho2

    println(comprouSorvete)
    println(comprouTV32)
    println(comprouTV50)

    if (!comprouSorvete){
        println("A saúde agradece!!")
    }

}