package com.oops.interfce;

public class Bike extends Vehicle {

	String type;

	public Bike(String brand, String model, double price, String type) {
		super(brand, model, price);
		this.type = type;
	}

	@Override
	public String[] showAccessories() {
		String[] accessories = new String[] { " seat cover", "gloves", "handles" };

		return accessories;
	}

	@Override
	public void insureType() {
		System.out.println("Bike insutrance");
	}

	@Override
	public void insureProviders() {
		System.out.println("star insurance");
	}

	@Override
	void getMileage() {
		System.out.println("good bike mileage");
	}


	void showMileage(String type) {
		if (type.equals("ola")) {
			System.out.println("100 km/hr");
		} else if (type.equals("Rx")) {
			System.out.println("200km/hr");
		} else {
			System.out.println("Not available");
		}
	}
}
