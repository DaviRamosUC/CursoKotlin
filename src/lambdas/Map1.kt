package lambdas

fun main(args: Array<String>) {
    val alunos = listOf("Pedro","Tiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { print(this) }
}