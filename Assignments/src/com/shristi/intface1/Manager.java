package com.shristi.intface1;

public class Manager extends Employee implements Entertainment {

	int experience;

	public Manager(String empName, String department, double salary, int experience) {
		super(empName, department, salary);
		this.experience = experience;
	}

	@Override
	void calcBonus(int amount) {
		System.out.println("Manger bonus is " + (salary + amount));
	}

	void showHobbies(String[] hobbies) {
		for (String hobby : hobbies) {
			System.out.println(hobby);
		}

	}

	@Override
	public void showTypes() {
		System.out.println("Party, drama");
	}
	
	@Override
	public void showMenus() {
		System.out.println("South indian");
	}
}
