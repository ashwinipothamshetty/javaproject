package com.oops.exceptionhandling;

public class MultiCatch {
	public static void main(String[] args) {
		
		try {
			System.out.println("Welcome");
			String value = args[0];
			System.out.println("value" + value);
			int num = Integer.parseInt(value);
			System.out.println("Number" + num);
			int result = 10 / num;
			System.out.println("result" + result);
			String[] arr = null;
			String value1 = arr[3];
		} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter a number greater than 0");
		} catch (RuntimeException e) {
			System.out.println("other exception");
		} catch (Exception e) {
			System.out.println("other exception");

		}

		System.out.println("work done");
	}

}
