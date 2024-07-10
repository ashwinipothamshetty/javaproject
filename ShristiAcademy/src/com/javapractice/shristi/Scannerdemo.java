package com.javapractice.shristi;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("name is : "+name);
		int age=sc.nextInt();
		System.out.println("age is : "+age);
		double salary=sc.nextDouble();
		System.out.println("Salary is : "+ salary);
		String city=sc.next();
		System.out.println("city is : "+ city);

	}

}
