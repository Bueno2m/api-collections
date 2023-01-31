package fantasticenigma

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2500.0, "PJ")
    val pedro = Funcionario("Pedro", 1800.0, "CLT")

    println("---------- LIST -----------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it)}

    println("---------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------- SET -----------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("---------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarioSet.remove(pedro)
    funcionarios.forEach { println(it) }
}