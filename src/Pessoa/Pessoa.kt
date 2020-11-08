package Pessoa

//Construtor Classe Pai
open class Pessoa(open var nome: String, open var cpf: Int) {
    //Verifica nome
    fun verNome(){
        println("Nome: $nome")
    }
    //Verifica Cpf
    fun verCpf(){
        println("Cpf: $cpf")
    }
}