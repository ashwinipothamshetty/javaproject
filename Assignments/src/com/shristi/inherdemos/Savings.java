package com.shristi.inherdemos;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) { 
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of 1000 required.");
        }
    }

	@Override
    public void deposit(double amount) {
        balance += amount + (amount * 0.02); 
        System.out.println("Deposited with interest: " + amount);
    }
}
