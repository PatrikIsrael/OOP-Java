package program;
/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
        Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
        exemplo).
        Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.*/

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name account: ");
        String name  = sc.nextLine();

        System.out.println("Is there initial deposit (y/n)");
        char response = sc.next().toLowerCase().charAt(0);

        Account acc;
        if (response == 'y'){
            System.out.println("Enter inital deposit value");
            double initialDeposit = sc.nextDouble();
            acc = new Account(name, accountNumber, initialDeposit);
        }else{
            acc = new Account(name, accountNumber);
        }

        System.out.println("Account data: ");
        System.out.println(acc);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);

        System.out.println("Update account data: ");
        System.out.println(acc);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);

        System.out.println("Update account data: ");
        System.out.println(acc);

        sc.close();
    }
}