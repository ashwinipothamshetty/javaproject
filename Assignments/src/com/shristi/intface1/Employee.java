package com.shristi.intface1;

public abstract class Employee implements Cafetaria {

	String empName;
	String department;
	double salary;
	
	public Employee(String empName, String department, double salary) {
		super();
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	
	void printDetails() {
		System.out.println("Employee Name "+ empName + " Department "+ department+"salary "+salary) ;
	}
	
	
	@Override
	public void showMenus() {
		System.out.println("Pizza,Burger");
	}
	
	abstract void calcBonus(int amount) ;
	
	
	
}
