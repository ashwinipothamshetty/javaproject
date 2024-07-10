package com.shristi.Abstractdemos;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to banking , press 1 for savings account and press 2 for current account");
		int accountType = sc.nextInt();
		Bank bank = null;
		switch (accountType) {
		case 1:
			bank = new Savings(10000);
			break;
		case 2:
			bank = new Current(10000);
			break;
		}
		boolean running = true;
		while (running) {
			System.out.println("Select an option:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
		

		int result = sc.nextInt();
		switch (result) {
		case 1:
			System.out.println("Enter amount to be deposited");
			int DepositAmount=sc.nextInt();
			bank.deposit(DepositAmount);
			break;
		case 2:
			System.out.println("Enter amount to be withdrawn");
			int withdrawnAmount=sc.nextInt();
			bank.withdraw(withdrawnAmount);
			break;
		case 3:
			double result1=bank.getBalance();
			System.out.println(result1);
			break;
		case 4:
			running = false;
			System.out.println("Thanks for banking with ATM");
			break;
		default:
			System.out.println("Enter valid number");
		}
		
	}
	}
}
