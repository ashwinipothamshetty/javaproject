package com.oops.override;

public class CreditCard extends Payment{
	
	@Override
	void PayBills() {
		System.out.println("buying gadgets");
	}

}
