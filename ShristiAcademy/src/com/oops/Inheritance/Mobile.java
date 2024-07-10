package com.oops.Inheritance;

public class Mobile {
	
	String model;
	double price;
	String brand;
	
	void print() {
		System.out.println(model + " "+ price+ " "+ brand);
	}

	public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	

}
