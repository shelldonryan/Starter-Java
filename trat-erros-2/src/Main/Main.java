package Main;

import java.util.Scanner;

import Exception.WithdrawException;
import Model.Account;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo: ");
        int balance = sc.nextInt();
        System.out.print("Limite de Saque: ");
        int withdrawLimit = sc.nextInt();

        Account account = new Account(
            number,
            holder, 
            balance, 
            withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Novo Saldo: %.2f%n", account.getBalance());
        } catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
