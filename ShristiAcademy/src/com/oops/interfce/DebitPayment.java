package com.oops.interfce;

public class DebitPayment extends CardPayment {

	@Override
	public void payBills() {
		System.out.println("Payment using Debit Card");
	}

}
