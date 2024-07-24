package com.oops.exceptionhandling;

public class Bank {

	void withdraw(int amount) throws Exception {
		System.out.println("Bank details");
		try {
			if (amount > 2000) {

				throw new Exception();
			}
		} catch (Exception e) {
			e.getMessage();
			throw e;
		} finally {
			System.out.println("Close db");
		}
		System.out.println("work done");
	}
}
