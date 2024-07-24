package com.shristi.intface2;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calci = (x,y) -> System.out.println(x + y);
		calci.calculate(10, 100);
	}

}
