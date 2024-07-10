package com.oops.Inheritance;

public class InManager extends InEmployee{
	
	double sal;
	
	
	public InManager(String empName, int empId, double sal) {
		super(empName, empId);
		this.sal = sal;
	}

	void calBonus(int amount) {
		System.out.println(sal + amount);
	}

}
