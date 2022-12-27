package fundamentos

class Carro(var cor: String,var anoFabricacao: Int, val dono: Dono)

data class Dono(var nome: String, var idade: Int)

fun main(){
    var carro = Carro("Branco", 2021, Dono("Filipe", 32))

    println(carro.cor)

    carro.cor = "preto"
    println(carro.cor)
    println(carro.dono)

    carro.dono.nome = "Roberto"

    println(carro.dono.nome)


}