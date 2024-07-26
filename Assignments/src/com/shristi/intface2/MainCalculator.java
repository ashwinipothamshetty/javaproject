package com.shristi.intface2;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calci = (x, y) -> System.out.println(x + y);
		calci.calculate(10, 100);

		calci = (x, y) -> {
			System.out.println(x - y);
		};
		calci.calculate(100, 10);

		calci = (x, y) -> {
			System.out.println(x * y);
		};
		calci.calculate(10, 5);

		calci = (x, y) -> {
			System.out.println(x / y);

		};
		calci.calculate(10, 2);
	}

}
