package fundamentos

class Pessoa(var nome: String, var idade: Int) {

    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idate: ${idade}"
    }
}


fun main() {
    var filipe = Pessoa(nome = "Filipe", idade = 32)
    println(filipe)
}