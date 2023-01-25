package fantasticenigma

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Robin"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }

    println("-----------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-----------------------------")
    val nomes2 = arrayOf("Maria", "Joao", "Victor")

    nomes2.sort()
    nomes2.forEach { println(it) }
}