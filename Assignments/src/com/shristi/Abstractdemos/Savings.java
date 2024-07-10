package com.shristi.Abstractdemos;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (balance - amount < 1000) {
			System.out.println("Minimum balnce required is 1000");
		} else {
			balance -= amount;
			System.out.println("Windrawn succesfull");
		}
	}

	@Override
	void deposit(double amount) {
		balance += amount+amount*(0.2); // assuming 2% interest
        System.out.println("Deposited with interest: " + amount);
	}

}
