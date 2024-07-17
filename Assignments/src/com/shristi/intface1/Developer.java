package com.shristi.intface1;

public class Developer extends Employee implements Games {

	String designation;

	@Override
	void calcBonus(int amount) {
		System.out.println("Developer bonus is " + salary + amount);
	}

	public Developer(String empName, String department, double salary, String designation) {
		super(empName, department, salary);
		this.designation = designation;
	}

	@Override
	public void indoor() {
		System.out.println("teenis ball,carroms");
	}

	@Override
	public void outdoor() {
		System.out.println("cricket,hockey");

	}

	void showSkills(String[] skills) {
		for (String skill : skills) {
			System.out.println(skill);
		}

	}
}
