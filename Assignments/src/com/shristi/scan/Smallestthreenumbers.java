package com.shristi.scan;

import java.util.Scanner;

public class Smallestthreenumbers {

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
		
		if(a<b && a<c) {
			System.out.println(a + " is smallest number");
		}else if(b<c && b<a){
			System.out.println(b + " is smallest number");
		}else {
			System.out.println(c + " is smallest number");
		}

	}

}
