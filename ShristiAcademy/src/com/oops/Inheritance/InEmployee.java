package com.oops.Inheritance;

public class InEmployee {
	
	String empName;
	int empId;
	
	
	
	
	public InEmployee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}




	/*
	 * public InEmployee() { super(); this.empName = "Ram"; this.empId = 10; }
	 */



	void printDetails() {
		System.out.println(empName + " "+ empId);
	}

}
