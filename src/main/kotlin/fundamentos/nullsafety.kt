package fundamentos

fun main() {

    var nome = "Filipe"
    //nome = null
    var nulo = null
    var name : String? = "Gustavo"

    println(nome)
    println(name?.length)
    val toShort = name!!.length.toShort()

    println(toShort)

    var naame : String? = null

    var tamanho:Int = naame?.length ?: 0

    println(tamanho)

    var lista : List<Int?> = listOf(1,2,null,4)
    var listaNullable: List<Int>? = null


}