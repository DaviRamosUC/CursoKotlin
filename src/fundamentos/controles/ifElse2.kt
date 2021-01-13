package fundamentos.controles

fun main(args: Array<String>) {
    val num1: Int = 2
    val num2: Int = 3
    val maiorValor = if (num1> num2){
        println("Processando...")
        num1 //isso equivale a um return
    }else{
        println("Processando...")
        num2
    }
        println("O maior valor é $maiorValor")

//    if (num1>num2) ? println("a") : println("b") Exemplo de operador ternário em Java

//    val maiorValor = if (num1> num2) num1 else num2
//    Exemplo de solução para a falta de um operador ternário em Kotlin
}