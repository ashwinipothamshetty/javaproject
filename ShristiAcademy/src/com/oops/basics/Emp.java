package com.oops.basics;

public class Emp {

	
	String employeeName;
	int employeeId;
	
	public void printDetails() {
		System.out.println("Employee name is "+ employeeName+ " and employee Id is " + employeeId);
	}
	
	String greetMessage(String empName) {
		return "Hello" + empName+ "Have a good day";
		
	}
}
