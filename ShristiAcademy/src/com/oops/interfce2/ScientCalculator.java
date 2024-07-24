package com.oops.interfce2;

public class ScientCalculator implements Iscientific{

	@Override
	public void add(int x, int y) {
		System.out.println("scientificCalci adding " + (x+y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("scientificCalci Product " + (x*y));
		
	}

	@Override
	public void square(int x) {
		System.out.println("scientificCalci square " + Math.pow(x, 2));
		
	}

	@Override
	public void cube(int x) {
		System.out.println("scientificCalci cube " + Math.pow(x, 3));
		
	}

}
