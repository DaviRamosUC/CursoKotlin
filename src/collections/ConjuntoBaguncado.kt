package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)


//    conjunto.get(1) Não existe indice para hashSET

    conjunto.add(3).print() // SET não aceita repetição de valores != do List que recebe duplos valores iguais
    conjunto.add(10).print()

    conjunto.size.print()//Adicionou +1

    conjunto.remove("a").print()
    conjunto.remove('a').print()
    conjunto.print()

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nums = setOf(1,2,3)
//    nums.add(4)

    (conjunto+nums).print()
    (conjunto-nums).print()

    conjunto.intersect(nums).print() // não muda o conjunto, Emite um novo conjunto
    conjunto.retainAll(nums) // muda o conjunto , NÃO É APROPRIADO
    conjunto.print()

    conjunto.clear().print() // Zera o conjunto -> UNIT = void
}