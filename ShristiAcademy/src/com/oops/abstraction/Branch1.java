package com.oops.abstraction;

public class Branch1 extends Bank {

	@Override
	void educationLoan() {
		System.out.println("Branch 1-10%");
	}

	@Override
	void carLoan() {
		System.out.println("Branch 1-20%");
	}

	@Override
	void HouseLoan() {
		System.out.println("Branch 1-30%");
	}
	
	
	
	void payBills() {
		System.out.println("Branch 1-Paying bills");
	}

}
