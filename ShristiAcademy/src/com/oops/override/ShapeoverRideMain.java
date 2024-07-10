package com.oops.override;

public class ShapeoverRideMain {

	public static void main(String[] args) {

		Shape shape=new Shape();
		shape.are(10, 10);
		
		shape=new Rectangle();
		shape.are(100,20);
		
		//We cannot call the method perimeter as it belongs to subclass Rectangle only
		
		Rectangle rectangle=(Rectangle) shape;
		rectangle.perimeter(5, 10);
		
		
		shape=new Square();
		shape.are(10,20);
		
		shape=new Traingle();
		shape.are(10,20);
		

		
	}

}
