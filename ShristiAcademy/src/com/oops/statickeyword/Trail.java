package com.oops.statickeyword;

import com.oops.abstraction.BankMain;

public class Trail {

	static int x = 10;
	static int y;

	static {

		System.out.println(x + y);
		System.out.println("Block-1");
		y = 100;
	}

	static {

		System.out.println("sum " + (x + y));
		System.out.println("Block-2");
		System.out.println("Greetings");
	}

	static void greet() {
		System.out.println("Welcome");
		System.out.println("power " + Math.pow(y, 2));

	}

	void print() {
		System.out.println("product " + (x + y));
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		Trail.greet();
		Trail trail = new Trail();
		trail.print();
	}

}
