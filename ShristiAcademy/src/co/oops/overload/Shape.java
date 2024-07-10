package co.oops.overload;

public class Shape {

	void area(int x) {
		System.out.println("square " + x * x);
	}

	/*
	 * void area(float x) { System.out.println("circle " + (Math.PI * x * x)); }
	 */

	int area(int x, int y) {
		return x * y;
	}
	
	double area(int x,float y) {
		return x*y*0.5;
	}

}
