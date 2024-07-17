package com.oops.interfce;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice of payment : cash/upi/card");
		String choice=sc.next();
		PaymentGateway payment;
		switch(choice.toUpperCase()) {
		case "CASH":
			payment=new CashPayment();
			payment.payBills();
			break;
		case "CARD":
			payment=new CreditPayment();
			payment.payBills();
			break;
		case "UPI":
			payment=new UPIPayment();
			payment.payBills();
			break;
			default:
				System.out.println("Invalid");
		
		}
	}

}
