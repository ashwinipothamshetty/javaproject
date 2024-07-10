package com.oops.basics;

public class Empmain {

	String employeeName;
	int employeeId;

	public static void main(String[] args) {

		Emp emp1=new Emp();
		emp1.employeeName="Ashwini";
		emp1.employeeId=1;
		emp1.printDetails();
		String Result=emp1.greetMessage("Ash");
		System.out.println(Result);
	
		
		Emp emp2=new Emp();
		emp2.employeeName="sonu";
		emp2.employeeId=15;
		emp2.printDetails();
		
	}

}
