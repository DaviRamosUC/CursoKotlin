package fundamentos.controles

fun obterResultado (nota: Double = 0.0): String = if (nota>=7) "Aprovado" else "Reprovado"

fun main(args: Array<String>) {
    print(obterResultado(8.3))
}