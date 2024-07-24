package com.oops.exceptionhandling;

public class MainExp {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
			String value = args[0];
			System.out.println("value" + value);
			int num = Integer.parseInt(value);
			System.out.println("Number" + num);
			int result = 10 / num;
			System.out.println("result" + result);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("work done");
	}

}
