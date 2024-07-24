package com.oops.interfce2;

public class MainCalci {

	public static void main(String[] args) {
		Icalculator cal = new BasicCalculator();
		cal.add(10, 10);
		cal.product(2, 2);

		Icalculator cal2 = new ScientCalculator();
		cal2.add(10, 10);
		cal2.product(2, 3);

		Iscientific cal3 = (ScientCalculator) cal2;
		cal3.square(2);
		cal3.cube(2);
	}

}
