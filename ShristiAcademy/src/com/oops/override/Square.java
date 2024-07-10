package com.oops.override;

public class Square extends Shape {

	@Override
	public void are(int x, int y) {
		System.out.println("Area of Sqyare" +x * x);
		super.are(x, y);
	}

}
