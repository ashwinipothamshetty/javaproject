package co.oops.overload;

public class OverloadDemo {

	public static void main(String[] args) {

		Shape shape=new Shape();
		shape.area(10);
		shape.area((int) 18.5f);
		int rectangle=shape.area(10, 10);
		double y=shape.area(10, 10.5f);
		
		System.out.println("Rectangle " +rectangle);
		System.out.println("Traingle "+y);
	}

}
