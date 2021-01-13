package fundamentos.controles

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`) // equivale ao Scanner no Java

    val nota: Double = scan.nextDouble()
    if (nota>=7){
        println("Aprovado!!")
    }else{
        println("Reprovado!!")
    }
}