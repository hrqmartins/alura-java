/*
O sistema deve simular um banco, sendo possivel fazer uma transferencia, visualizar saldo disponivel, receber valor

[X] Inicializar dados do cliente
[X] Menu de opções
[X] Visualização do saldo
[X] Enviar valor
[X] Receber valor
*/


package SistemaBancario;

import java.util.Scanner;

public class BancoANNE {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);

        // Dados do Cliente
        String nome = "Henrique Oliveira";
        String tipoConta = "Corrente";
        double saldo = 1124.99;
        int opca = 0;

        // Inicialização
        System.out.println("*****************************************\n" +
                "DADOS INICIAIS DO CLIENTE:\n\n" +
                "Nome: " + nome + "\n" +
                "Tipo Conta: " + tipoConta + "\n" +
                "Saldo inicial: " + saldo + "\n" +
                "*****************************************\n\n");

        // Menu de Operações
        String menu = """
                \nBANCO ANNE\n
                **- DIGITE UMA OPÇÃO --*
                1- CONSULTAR SALDO
                2- TRANSFERIR 
                3- RECEBER
                4- SAIR
                """;

        while (opca != 4) {
            System.out.println(menu);
            opca = opcao.nextInt();
        if (opca == 1) {
            System.out.println("O saldo atualizado é R$"+ saldo);
        } else if (opca == 2) {
            System.out.println("Digite o valor a ser recebido");
            double valor = opcao.nextDouble();
            if (valor > saldo) {
                System.out.println("Você não tem essa quantia.");
            } else {
                saldo = saldo - valor;
                System.out.println("Novo saldo: R$" + saldo);
            }
        }else if (opca == 3) {
            System.out.println("Digite o valor a ser recebido");
            double valor = opcao.nextDouble();
            saldo += valor;
            System.out.println("O seu saldo atualizado é de R$: " + saldo);
        } else if (opca == 4) {
            System.out.println("Encerrando programa...");
            break;
        } else{
            System.out.println("Digite uma opção valida do menu");
        }

        }


    }

}

/*

CODIGO CORRIGIDO

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
} */
