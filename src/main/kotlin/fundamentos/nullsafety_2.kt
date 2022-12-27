package fundamentos

fun main() {
    val pessoa: Pessoa? = Pessoa("Filipe", 32)
    val pessoaNull: Pessoa? = null

    println(pessoa!!.nome)
    println(pessoaNull!!.nome)
}