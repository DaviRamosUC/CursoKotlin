package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 1..10){
        if (i==5){
            break;  //sai do laço em que estiver
        }
        println("Atual: $i")
    }
}