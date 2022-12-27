package fundamentos

fun main() {
    var lista = listOf(1, 2, 3, 4, 6, 7)
    var lista2 = mutableListOf(1, 2, 3, 4, 6, 7, 10)
    var lista3 = mutableListOf(4,7,2,1,5,18,12)
    val pares = lista.filter { it % 2 == 0 }.first()

    for (numero in lista){
        println(numero)
    }
    println(pares)

    lista.forEach{
        println(it)
    }

    println(lista[1])
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(6))

    lista2.add(9)
    println(lista2)
    lista2.removeAt(0)
    println(lista2)
    lista2.remove(3)
    println(lista2)

    lista2[0] = 20
    println(lista2)

    println(lista3)
    lista3.sort()
    println(lista3)

    lista3.shuffle()
    println(lista3)

    var listaNomes = mutableListOf("Filipe","Daniel")
    println(listaNomes)
    listaNomes.sort()
    println(listaNomes)


    var setNumeros = setOf(1, 2, 3, 2)
    var listaNumeros = listOf(1, 2, 3, 2)

    println(setNumeros.contains(2))
    println(setNumeros)
    println("Lista $listaNumeros")

    var mapNomeIdade = mutableMapOf("Gustavo" to 24, "Daniel" to 20)

    println(mapNomeIdade)

    //mapNomeIdade.put("Bruno", 30)
    mapNomeIdade["Bruno"] = 30

    println(mapNomeIdade)

    mapNomeIdade.remove("Bruno")

    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Gustavo", 30)

    println(mapNomeIdade)


}