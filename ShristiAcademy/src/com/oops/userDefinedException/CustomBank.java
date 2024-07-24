package com.oops.userDefinedException;

public class CustomBank {

	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(int amount) throws NegativeBalanceException, OutOfLimitsException, Exception {
		System.out.println("Bank details");

		try {
			double total = balance - amount;
			if (total <= 0) {

				throw new NegativeBalanceException("Balance is negative");
			} else if (amount > 2000) {
				throw new OutOfLimitsException("Out of limit , amount greater than 2000");
			}
		} catch (NegativeBalanceException e) {
			System.out.println("server problem 1");
			throw e;
		} catch (OutOfLimitsException e) {
			System.out.println("server problem 2");
			throw e;
		} catch (Exception e) {
			System.out.println("server problem");
			throw e;
		} finally {
			System.out.println("db close");
		}
		System.out.println("work done");
	}

}
