package Pessoa
import Conta.Conta

//Contrutor Cliente - Herda de Pessoa
data class Cliente(override var nome: String, override var cpf: Int, var conta: Conta?): Pessoa(nome, cpf){
    //Realiza a criação da Conta
    fun criarConta(){
        println("Informe o tipo de conta: (CC, CP, CS)")
        var tipoDeConta: String = readLine().toString()
        conta = Conta(tipoDeConta, 0.0)
    }
}

