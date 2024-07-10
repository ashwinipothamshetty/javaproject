package com.oops.override;

public class DebitPayment extends Payment {
	
	
	@Override
	void PayBills() {
		System.out.println("paying electricity");
	}
}
