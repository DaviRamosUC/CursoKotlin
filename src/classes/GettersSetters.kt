package classes

class Cliente2{
    constructor(nome: String){
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value){
            field=value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main(args: Array<String>) {
    val c1 = Cliente2("")
    with(c1){
        println("$nome")
    }

    val c2 = Cliente2("Pedro")
    with(c2){
        println("$nome")
    }
}
