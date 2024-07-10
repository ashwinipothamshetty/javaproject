package com.oops.override;

public class UPIPayment extends Payment {
	
	@Override
	void PayBills() {
		System.out.println("paying bills for grocery");
	}

}
