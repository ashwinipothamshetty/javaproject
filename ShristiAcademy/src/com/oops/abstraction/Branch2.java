package com.oops.abstraction;

public  abstract class Branch2 extends Bank{
	
	
	@Override
	void educationLoan() {
		System.out.println("Branch 2-100%");
	}

	@Override
	void HouseLoan() {
		System.out.println("Branch 2-80%");
	}
	
	void showPayments() {
		System.out.println("Branch 2-showing payment details");
	}

	

}
