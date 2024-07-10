package com.shristi.Abstractdemos;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insuffiecient balance");
		} else {
			balance-=amount;
			System.out.println("amount withdrawn successfully");

		}
	}

	@Override
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

}
