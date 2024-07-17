package com.shristi.intface1;

public class Main {

	public static void main(String[] args) {

		String[] hobbies = new String[] { "playing", "eating", "reading" };
		String[] skills = new String[] { "java", "python", "dotnet" };
		String[] projects = new String[] { "ATM", "Hospital", "Pharmaceutical" };

		Employee emp = new Manager("Sunil", "CSE", 1000000, 10);
		emp.printDetails();
		emp.calcBonus(10000);
		emp.showMenus();

		Manager manager = (Manager) emp;
		manager.calcBonus(800);
		manager.showHobbies(hobbies);
		manager.showTypes();
		
		emp=new Developer("Ashwini","ECE",80000,"SE-1");
		emp.printDetails();
		emp.showMenus();
		emp.calcBonus(5000);
		
		Developer developer=(Developer)emp;
		developer.calcBonus(6000);
		developer.indoor();
		developer.outdoor();
		developer.showSkills(skills);
		
		emp=new Tester("sirisha","game changer", 90000);
		emp.printDetails();
		emp.showMenus();
		emp.calcBonus(1000);
		
		Tester tester=(Tester)emp;
		tester.showProjects(projects);
		tester.showTypes();
		

	}

}
