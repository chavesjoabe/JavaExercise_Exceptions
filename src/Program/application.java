package Program;

import Exceptions.DomainExceptions;
import system.entities.Account;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Owner: ");
            String owner = scanner.nextLine();
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, owner, balance, withdrawLimit);
            System.out.println();
            System.out.println(account);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (DomainExceptions e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
