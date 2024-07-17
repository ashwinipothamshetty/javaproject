package com.oops.interfce;

public class Customer {

	public static void main(String[] args) {
		Vehicle vehicle=new Car("Honda","city",1200000.87,5);
		
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.insureProviders();
		vehicle.insureType();
		String[] accessories=vehicle.showAccessories();
		for(String access: accessories) {
			System.out.println(access);
		}
		
		Car car=(Car)vehicle;
		car.showCarType("SUV");
		
		
		vehicle =new Bike("Rx100", "model-1", 80000, "Rx");
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.insureProviders();
		vehicle.insureType();
		String[] accessories1=vehicle.showAccessories();
		for(String access: accessories1) {
			System.out.println(access);
		}
		
		Bike bike=(Bike)vehicle;
		bike.showMileage("Rx");
		

	}

}
