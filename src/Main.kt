import Pessoa.Cliente
import Pessoa.Funcionario

//Declaração de variaveis
var clientes: ArrayList<Cliente> = arrayListOf()
var funcionarios = arrayListOf<Funcionario>()

fun main() {
    //Menu Básico
    println("1- Cadastrar Pessoa & Criar conta \n" +
            "2- Cadastrar Funcionario \n" +
            "3- Listar Clientes \n" +
            "5- Entrar na Conta \n" +
            "Digite Opção: ")
    //Armazena a opção
    var opcao = readLine().toString().toInt()
    //Processa e trata a opção informada
    when (opcao){
        1 -> cadastrarPessoa()
        2 -> cadastrarFuncionario()
        3 -> listarClientes()
        4 -> listarFuncionarios()
        5 -> removerCliente()
    }
}

//METODOS
//Cadastrar Pessoa
fun cadastrarPessoa() {
    println("Informe o nome da Pessoa")
    var nome: String = readLine().toString()
    println("Informe o Cpf")
    var cpf: Int = readLine().toString().toInt()
    var cliente = Cliente(nome, cpf, null)
    clientes.add(cliente)
    main()
}
//Cadastrar Funcionario
fun cadastrarFuncionario() {
    println("Informe o nome do Funcionario")
    var nome: String = readLine().toString()
    println("Informe o Cpf")
    var cpf: Int = readLine().toString().toInt()
    println("Informe cargo")
    var cargo: String = readLine().toString()
    var funcionario = Funcionario(nome, cpf, cargo)
    funcionarios.add(funcionario)
    main()
}
//Listar Clientes
fun listarClientes(){
    println(clientes)
    main()
}
//Listar Funcionarios
fun listarFuncionarios(){
    println(funcionarios)
    main()
}
//Remover Cliente
fun removerCliente(){
    println("Informe Cpf")
    var cpf: Int = readLine().toString().toInt()
    var cliente: Cliente
    //Tratativa de erro no controle de fluxo FOR
    try {
        for (clienteBusca in clientes){
            if(clienteBusca.cpf == cpf){
                cliente = clienteBusca
                println(clientes)
                //Erro ao Remover
                //EM TRATATIVA
                clientes.remove(cliente)
                println(clientes)
            }
        }
    }catch (e: Exception){
        main()
    }

    main()
}