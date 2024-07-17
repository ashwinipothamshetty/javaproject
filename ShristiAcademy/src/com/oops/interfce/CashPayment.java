package com.oops.interfce;

public class CashPayment implements PaymentGateway {

	@Override
	public void payBills() {
		System.out.println("payment using cash");
	}

}
