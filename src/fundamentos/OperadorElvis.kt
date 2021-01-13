package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
    val obrigatorio: String =
        opcional ?: "Valor Padrão" //Valor padrão é uma excessão para caso não tenha nada no opcional

    println(obrigatorio)
}