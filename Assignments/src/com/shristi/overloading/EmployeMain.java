package com.shristi.overloading;

import java.util.Scanner;

public class EmployeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first employee details");
		System.out.println("Enter Name -");
		String name = sc.next();
		System.out.println("Enter Designation -");
		String designation = sc.next();

		System.out.println("Enter the second employee details");
		System.out.println("Enter Name -");
		String name1 = sc.next();
		System.out.println("Enter Designation -");
		String designation1 = sc.next();

		System.out.println("Enter the third employee details");
		System.out.println("Enter Name -");
		String name2 = sc.next();
		System.out.println("Enter Designation -");
		String designation2 = sc.next();

		Employee employee = new Employee(name, designation);

		employee.printDetails();
		if (designation.equalsIgnoreCase("Manager")) {
			double result1 = employee.calcBonus(1501, 8000);
			System.out.println(result1);
		} else if (designation.equalsIgnoreCase("programmer")) {
			double result2 = employee.calcBonus(1500);
			System.out.println(result2);

		} else if (designation.equalsIgnoreCase("Director")) {
			double result3 = employee.calcBonus(1500, 8000, 10000);
			System.out.println(result3);

		}
		Employee employee2 = new Employee(name1, designation1);
		employee2.printDetails();

		if (designation1.equalsIgnoreCase("Manager")) {
			double result4 = employee.calcBonus(1501, 8000);
			System.out.println(result4);
		} else if (designation1.equalsIgnoreCase("programmer")) {
			double result5 = employee2.calcBonus(1500);
			System.out.println(result5);

		} else if (designation1.equalsIgnoreCase("Director")) {
			double result6 = employee2.calcBonus(1500, 8000, 10000);
			System.out.println(result6);

		}
		Employee employee3 = new Employee(name2, designation2);

		employee3.printDetails();

		if (designation2.equalsIgnoreCase("Manager")) {
			double result7 = employee.calcBonus(1501, 8000);
			System.out.println(result7);
		} else if (designation2.equalsIgnoreCase("programmer")) {
			double result8 = employee3.calcBonus(1500);
			System.out.println(result8);

		} else if (designation2.equalsIgnoreCase("Director")) {
			double result9 = employee3.calcBonus(1500, 8000, 10000);
			System.out.println(result9);

		}

	}

}
