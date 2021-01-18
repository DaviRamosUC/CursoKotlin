package classes


class Filme3(nome: String, anoLançamento: Int, genero: String) {
    val nome: String
    val anoLançamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLançamento = anoLançamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("Os Incriveis", 2004, "Ação")
    with(filme){
        println("A $genero $nome foi lançado em $anoLançamento")
    }
}