package com.shristi.inherdemos;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft not allowed");
        }
    }

	@Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

}
