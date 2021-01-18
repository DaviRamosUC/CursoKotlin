package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata","Bernado","Willian","Andreia","Caio")
    val ordenados = nomes.sortedBy { it }
    val ordenados2 = nomes.sortedBy { it.reversed() }

    println(ordenados)
    println(ordenados2)
}