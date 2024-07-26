package com.shristi.intface1;

public class BasicClass implements BasicCalculator{

	@Override
	public void add(int x, int y) {
		System.out.println(x + y);	}

	@Override
	public void difference(int x, int y) {
		System.out.println(x - y);		
	}

	@Override
	public void product(int x, int y) {
		System.out.println(x * y);		
	}

	@Override
	public void divide(int x, int y) {
		System.out.println(x / y);		
	}

}
