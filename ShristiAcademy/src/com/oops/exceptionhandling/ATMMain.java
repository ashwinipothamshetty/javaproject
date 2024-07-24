package com.oops.exceptionhandling;

public class ATMMain {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome");
		Bank bank = new Bank();
		try {
			bank.withdraw(1000);
			System.out.println("withdrawn successfully");
		} catch (Exception e) {
			System.out.println("technical error");
		}
		System.out.println("gud bye");
	}
}
