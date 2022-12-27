package fundamentos

fun main(){

    parOuImpar(2)
    parOuImpar(3)
    resultadoDaNota(8)
    resultadoDaNota(4)
    resultadoDaNota(2)
    println(parOuImparReturn(2))
    println(parOuImparReturn(9))
}

fun parOuImpar(numero: Int){
    if(numero % 2 == 0){
        println("par")
    }else {
        println("impar")
    }
}

fun parOuImparReturn(numero: Int): String{
    return if(numero % 2 == 0){
        "Par"
    }else {
        "Impar"
    }
}

fun resultadoDaNota(nota: Int){
    if(nota >= 6){
        println("passou")
    } else if (nota >= 4) {
        println("recuperação")
    } else {
        println("Reprovou")
    }
}