package fundamentos.operadores

import java.util.*

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca,$modelo")

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")

    val (_,_,terceirolugar)= listOf("Kimi","Hamilton","Alonso")
    println("$terceirolugar terminou em terceiro lugar.")
}