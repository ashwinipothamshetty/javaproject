package com.oops.interfce;

public abstract class Vehicle implements Accessories,Insurance{

	private String brand;
	private String model;
	private double price;
	
	public Vehicle(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void printDetails() {
		
		System.out.println("Brand "+ brand +"Model" + model + "price"+price);
	}
	abstract void getMileage();
		
	
}
