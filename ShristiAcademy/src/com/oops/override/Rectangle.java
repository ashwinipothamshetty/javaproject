package com.oops.override;

public class Rectangle extends Shape {

	@Override
	public void are(int x, int y) {
		System.out.println("Area of Rectangle ");
	}
	
	public void perimeter(int x, int y) {
		System.out.println("perimeter of Rectangle " + (x+y));
	}

}
