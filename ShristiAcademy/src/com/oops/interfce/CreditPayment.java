package com.oops.interfce;

public class CreditPayment extends CardPayment{

	@Override
	public void payBills() {
		System.out.println("Payment using Credit Card");
	}

}
