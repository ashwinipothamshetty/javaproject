package com.shristi.inherdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Account account = null;

		System.out.println("Select account type:");
		System.out.println("1. Savings");
		System.out.println("2. Current");

		int accountType = scanner.nextInt();
		System.out.println("Enter initial balance:");
		double initialBalance = scanner.nextDouble();

		switch (accountType) {
		case 1:
			account = new Savings(initialBalance);
			break;
		case 2:
			account = new Current(initialBalance);
			break;
			
		default:
            System.out.println("Invalid account type.");
            System.exit(0);
		}
		
			boolean running=true;
			
			while (running) {
	            System.out.println("Select an option:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
         
         int choice = scanner.nextInt();
         double amount;
         
         switch (choice) {
         case 1:
             System.out.println("Enter amount to deposit:");
             amount = scanner.nextDouble();
             account.deposit(amount);
             break;
         case 2:
             System.out.println("Enter amount to withdraw:");
             amount = scanner.nextDouble();
             account.deposit(amount);
             break;
         case 3:
             System.out.println("Current balance: " + account.getBalance());
             break;
         case 4:
             running = false;
             break;
         default:
             System.out.println("Invalid option. Please try again.");
         }
         }
			
		scanner.close();
	     
		System.out.println("Thank you for using the ATM!");
	}
}

