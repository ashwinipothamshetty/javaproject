package com.oops.abstraction;

public class BankMain {

	public static void main(String[] args) {

		Bank bank=new Branch1();
		bank.carLoan();
		bank.educationLoan();
		bank.HouseLoan();
		bank.admin();
		
		Branch1 branch1=(Branch1)bank;
		branch1.payBills();
		
		bank=new SubBranch();
		bank.carLoan();
		bank.educationLoan();
		bank.HouseLoan();
		
		SubBranch subBranch=(SubBranch) bank;
		subBranch.checkBills();
		subBranch.showPayments();
		
		Branch2 branch2=(Branch2)bank;
		branch2.showPayments();
		branch2.admin();
		
	}

}
