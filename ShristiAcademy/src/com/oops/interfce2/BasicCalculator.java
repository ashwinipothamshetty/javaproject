package com.oops.interfce2;

public class BasicCalculator implements Icalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Basic adding " + (x+y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println(" Basic product " + (x*y));

	}

}
