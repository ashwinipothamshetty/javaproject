package com.oops.abstraction;

public class SubBranch extends Branch2{

	@Override
	void carLoan() {
		System.out.println("sub branch -50%");
	}
	
	@Override
	void educationLoan() {
		System.out.println("subBranch 90%");
	}
	
	void checkBills() {
		System.out.println("Sub branch -bills are checked");
	}

}
