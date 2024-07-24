package com.oops.userDefinedException;

public class CustomATM {
public static void main(String[] args) throws NegativeBalanceException, OutOfLimitsException, Exception {
	CustomBank customBank=new CustomBank(5000);
	 customBank.withdraw(3000);
	
}
	 
	 
}
