package fantasticenigma

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2500.0, "PJ")
    val pedro = Funcionario("Pedro", 1800.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("----------------------")

    repositorio.findAll().forEach { println(it) }

    println("----------------------")

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}