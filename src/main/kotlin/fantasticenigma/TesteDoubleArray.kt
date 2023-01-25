package fantasticenigma

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 4000.0
    salarios[2] = 400.0

    salarios.sort()
    salarios.forEach { println(it) }

    println("__________________________")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("__________________________")
    val salario2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salario2.sort()
    salario2.forEach { println(it) }
}