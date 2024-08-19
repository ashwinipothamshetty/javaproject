package com.oops.util;

public class Student {

	String studentName;
	String department;
	private int studentId;
	
	public Student() {
		super();
	}

	public Student(String studentName, String department, int studentId) {
		super();
		this.studentName = studentName;
		this.department = department;
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", department=" + department + ", studentId=" + studentId + "]";
	}
	
	

}
