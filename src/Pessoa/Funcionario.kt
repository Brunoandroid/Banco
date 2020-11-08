package Pessoa

data class Funcionario(override var nome: String, override var cpf: Int, var cargo: String): Pessoa(nome, cpf)

