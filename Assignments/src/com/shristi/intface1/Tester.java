package com.shristi.intface1;

public class Tester extends Employee implements Entertainment {

	public Tester(String empName, String department, double salary) {
		super(empName, department, salary);
	}

	@Override
	public void showTypes() {
		System.out.println("picnic,dinner");
	}

	@Override
	void calcBonus(int amount) {
		System.out.println("Tester bonus is " + salary + amount);
	}
	
	void showProjects(String[] projects) {
		for (String project : projects) {
			System.out.println(project);
		}

	}

}
