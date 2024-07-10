package com.shristi.objbasics;

public class Student {

	String name, department;
	int avg;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	public void printDetails() {
		System.out.println(" name=" + name + ", department=" + department);
	}

	String getGrades(int... marks) {
		int sum = 0;
		for (int mark : marks) {
			sum+=mark;
		}
		avg = sum / marks.length;

		switch (avg / 10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";

		case 6:
			return "D";
		case 5:
			return "E";

		default:
			return "fail";
		}
	}
}