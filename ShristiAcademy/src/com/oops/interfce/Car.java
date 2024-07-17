package com.oops.interfce;

public class Car extends Vehicle {

	int seaterCapacity;

	public Car(String brand, String model, double price, int seaterCapacity) {
		super(brand, model, price);
		this.seaterCapacity = seaterCapacity;
	}

	@Override
	public String[] showAccessories() {
		String[] accessories = new String[] { " seat cover", "belt", "music" };

		return accessories;
	}

	@Override
	public void insureType() {
		System.out.println("For vehicles and human");
	}

	@Override
	public void insureProviders() {
		System.out.println("star insurance & tata aig");
	}

	@Override
	void getMileage() {
		System.out.println("good mileage");
	}

	// own method
	void showCarType(String type) {
		if (type.equals("SUV")) {
			System.out.println("Luxury car");
			System.out.println("seater" + seaterCapacity);
		} else if (type.equals("Sedan")) {
			System.out.println("comfort car");
			System.out.println("seater" + seaterCapacity);
		} else {
			System.out.println("Not available");
		}
	}

}
