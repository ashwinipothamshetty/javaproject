package com.oops.Inheritance;

public class SmartPhone extends Mobile{
	
	String osType;
	String cameraType;
	
	

	

	public SmartPhone(String model, double price, String brand, String osType, String cameraType) {
		super(model, price, brand);
		this.osType = osType;
		this.cameraType = cameraType;
	}





	void showFeatures() {
		System.out.println(osType + " "+ cameraType);
		System.out.println("swiggy , instagram");
	}
}
