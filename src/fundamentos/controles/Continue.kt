package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 1..10){
        if (i==5){
            continue;   //pula o valor 5
        }
        println("Atual: $i")
    }
    println("fim")
}