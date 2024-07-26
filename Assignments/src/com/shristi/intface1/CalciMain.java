package com.shristi.intface1;

public class CalciMain {

	public static void main(String[] args) {
		BasicCalculator basicCalculator = new Scientific();
		basicCalculator.add(10, 10);
		basicCalculator.divide(10, 5);
		basicCalculator.difference(10,2 );
		
		Scientific sc=(Scientific)basicCalculator;
		sc.cube(3);
		sc.square(2);
	}

}
