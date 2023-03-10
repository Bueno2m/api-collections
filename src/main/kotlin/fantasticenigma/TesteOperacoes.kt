package fantasticenigma

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("------------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("------------------")
    salariosMaiorQue2500.forEach { println(it) }

    println("------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 250.0 })

    println("------------------")
    println(salarios.any { it == 2250.0 })
    println(salarios.any { it == 250.0 })
}