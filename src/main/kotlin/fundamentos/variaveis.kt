package fundamentos

fun main(){
    val nome = "Filipe"
    val nomeFixo = "Gustavo"

    var texto = "Texto"

    //mostrar que a variavel pode ser iniciada sem o tipo mas assume o tipo no momento que recebe o primeiro valor
    //texto = 123

    println(nome)
}


class variaveis {
    lateinit var teste: String



    fun iniciaVariaveis(){
        teste = "Teste"
    }
}