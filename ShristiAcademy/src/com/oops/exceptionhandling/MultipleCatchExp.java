package com.oops.exceptionhandling;

public class MultipleCatchExp {

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
		} catch (ArithmeticException e) {
			System.out.println("Please enter a number greater than 0");
		} catch (NumberFormatException e) {
			System.out.println("Please enter a number");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter a value");
		} catch (RuntimeException e) {
			System.out.println("other exception");
		} catch (Exception e) {
			System.out.println("other exception");

		}

		System.out.println("work done");
	}

}
