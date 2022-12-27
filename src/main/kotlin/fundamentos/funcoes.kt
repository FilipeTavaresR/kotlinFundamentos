package fundamentos

fun main(){

    println("Hello World")
    println(retornaNome())
    falaNome("Ana", 30)
    falaNome(retornaNome(), 33)
    falaNome(idade = 50, nome = "Farofa")
    falaNome("Lucas")
}

fun retornaNome(): String{
    return "Filipe"
}

fun falaNome(nome: String, idade: Int = 18){
    println("Oi ${nome}, parabéns pelo seus ${idade} anos")
}