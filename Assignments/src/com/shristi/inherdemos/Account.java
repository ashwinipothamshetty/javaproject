package com.shristi.inherdemos;

public class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

	double getBalance() {
		return balance;
	}

}
