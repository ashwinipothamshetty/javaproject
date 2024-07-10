package com.shristi.scan;

import java.util.Scanner;

public class Evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Even numbers till" + num +" are :");
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
