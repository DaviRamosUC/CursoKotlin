package classes

var desconto = 0.0
class ItemDePedido(val nome: String, var preco: Double){
    companion object{
        fun create(nome: String, preco: Double)=ItemDePedido(nome,preco)
//        @JvmStatic var desconto =0.0
    }

    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main(args: Array<String>) {
    val item1 = ItemDePedido.create("Tv 50 Polegadas", 2989.90)
    val item2 = ItemDePedido("Liquidificador", 200.00)
//    ItemDePedido.desconto = 0.10
    desconto = 0.10

    with(item1){
        println(precoComDesconto())
    }
    with(item2){
        println(precoComDesconto())
    }
}