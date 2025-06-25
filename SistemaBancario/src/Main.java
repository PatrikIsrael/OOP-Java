import entidades.ContaCorrente;
import entidades.ContaPoupanca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Bem vindo ao Banco Java ===");
            System.out.println("Qual tipo e sua conta ?");
            System.out.println("1. para conta corrente");
            System.out.println("2. para conta poupanca");
            System.out.println("3. Sair");
            System.out.println("Escolha: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nConta corrente selecionada");
                    ContaCorrente contaCorrente = new ContaCorrente();
                    menuContaCorrente(contaCorrente, sc);
                    break;

                case 2:
                    System.out.println("\nConta poupanca selecionada");
                    ContaPoupanca contaPoupanca = new ContaPoupanca();
                    menuContaPoupanca(contaPoupanca, sc);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Opcao invalida");
            }
        }
    }

    public static void menuContaCorrente(ContaCorrente conta, Scanner sc) {
        while (true) {
            System.out.println("\n=== MENU CONTA CORRENTE ===");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Voltar ou menu principal");
            System.out.println("Escolha");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    conta.verSaldo();
                    break;

                case 2:
                    System.out.println("Valor a depositar");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.println("Valor a ser sacado");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void menuContaPoupanca(ContaPoupanca conta, Scanner sc) {
        while (true) {
            System.out.println("\n=== MENU CONTA POUPANCA===");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver rendimentos");
            System.out.println("5. Voltar ou menu principal");
            System.out.println("Escolha");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    conta.verSaldo();
                    break;

                case 2:
                    System.out.println("Valor a depositar");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.println("Valor a ser sacado");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 4:
                    System.out.println("Deseja ver seu rendimento ?");
                    conta.aplicarRendimentos();

                case 5:
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}