package com.oops.override;

import java.util.Scanner;

public class PayMain {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.PayBills();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the payment Mode");
		String result = sc.next();

		if (result.equalsIgnoreCase("Type-1")) {
			payment = new CreditCard();
			payment.PayBills();

		} else if (result.equalsIgnoreCase("Type-2")) {
			payment = new DebitPayment();
			payment.PayBills();
		} else if (result.equalsIgnoreCase("Type-3")) {
			payment = new UPIPayment();
			payment.PayBills();
		}
	}

}
