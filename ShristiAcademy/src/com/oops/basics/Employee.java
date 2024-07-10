package com.oops.basics;

public class Employee {
	String employeeName;
	int employeeId;

	public static void main(String[] args) {

		Employee employee1=new Employee();
		employee1.employeeName="Ashwini";
		employee1.employeeId=1;
		
		Employee employee2=new Employee();
		employee2.employeeName="sunil";
		employee2.employeeId=10;
		
		Employee employee3=employee1;
		System.out.println(employee1.employeeName);
		System.out.println(employee2.employeeName);
		System.out.println(employee3.employeeName); // employee 1 & 3 referes to same object
		employee3=null;
		System.out.println(employee3.employeeName); //gives null pointer exception

		
		
	}

	
}
