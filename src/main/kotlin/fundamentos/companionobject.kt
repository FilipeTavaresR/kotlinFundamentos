package fundamentos

class MinhaClasse (
    var nome: String,
    var endereco: String,
    var idade: Int
    ){
    companion object{
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Filipe", "Rua Parana", 30)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse{
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Filipe", "Rua Parana", 30)
    }
}

fun main() {

    //var segundaClasse = SegundaClasse().criaClasse()
    var segundaClasse = SegundaClasse("nome", "endereço", 10).criarComValoresPadrao()

    var minhaClasse = MinhaClasse.criarComValoresPadrao()
    //var minhaClasse = MinhaClasse.criaClasse()

    //exemplo builder
    var minhaCLoader = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)
}