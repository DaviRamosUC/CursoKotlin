package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>) {
    val p1 = Produto("Ipad",2349.90,0.20, ativo = true)
    with(p1){
        println(precoComDesconto)
    }

    val p2 = Produto("Galaxy Note 7",2699.49,0.50,false)
    with(p2){
        println("$nome\n\tDe:R$ $preco \n\tPor: R$ $precoComDesconto")

        if (inativo){
            preco=0.0
            println("Depois de inativo: R$ $precoComDesconto")
        }
    }
}