package com.shristi.scan;

import java.util.Scanner;

public class Greatestthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		sc.close();
		String result = (a > b) && (a > c) ? a + " is greater" : b > c ? b + " is greater " : c + "is greater";

		System.out.println(result);

	}

}
