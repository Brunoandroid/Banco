package Conta

class Conta(var conta: String, var saldo: Double){
    //Verifica Saldo
    fun verSaldo(){
        println("Saldo: $saldo")
    }
    //Verifica o tipo de conta
    fun verTipoDeConta(){
        println("Tipo da Conta: $conta")
    }
    //Realiza o Saque
    fun realizarSaque(valor: Double){
        //Verifica o saldo e a possibilidade de saque
        if(saldo == 0.0 || (saldo-valor)<0){
            println("O valor que você deseja sacar é maior que seu saldo que é de: $saldo")
        }else{
            saldo = saldo - valor
        }
    }
    //Realiza o Deposito
    fun realizarDeposito(valor: Double){
        saldo = saldo + valor
    }
}

