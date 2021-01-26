package OO.encapsulamento

// VARIAVEIS E CONSTANTES
private val dentroDoArquvo = 1

//protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
/*public*/ val publico = 1

// FUNÇÕES
private fun dentroDoArquvo() = 1

//protected val protegidoNaoSuportadoAqui = 1
internal fun dentroDoProjeto() = 1
/*public*/ fun publico() = 1

//PERMITINDO CLASSES PARA HERANÇA
open class Capsula {
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1
    private fun dantroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() =1
}

class CapsulaFilha : Capsula(){
    fun verificarAcesso(){
//        println(Capsula().dentroDoObjeto)
//        println(Capsula().vaiPorHeranca)
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico())

    }
}

fun verificaAcesso(){
//    println(Capsula().dentroDoObjeto())
//    println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}

fun main(args: Array<String>) {

}