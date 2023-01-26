package fantasticenigma

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2500.0, "PJ")
    val pedro = Funcionario("Pedro", 1800.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

