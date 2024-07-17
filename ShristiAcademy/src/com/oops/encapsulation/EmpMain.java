package com.oops.encapsulation;

public class EmpMain {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEmpName("Ashwini");
		emp.setEmpId(1);
		emp.setMarried(true);
		emp.setSalary(70000);
		System.out.println(emp.toString());
	}

	

}
