package com.shristi.intface1;

public class Scientific extends BasicClass implements ScientificCalci{

	@Override
	public void square(int x) {
		System.out.println(x*x);
		
	}

	@Override
	public void cube(int x) {
		System.out.println(Math.pow(x, x));

	}

	
}
