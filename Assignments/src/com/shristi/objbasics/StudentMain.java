package com.shristi.objbasics;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name -");
		String name=sc.next();
		System.out.println("Enter Department -");
		String department=sc.next();
		System.out.println("Enter the number of subjects");
		int subjects=sc.nextInt();
		System.out.println("Enter the marks");
		int[] marks = new int[subjects];
		
		

		for(int i=0;i<subjects;i++) {
			marks[i]=sc.nextInt();
		}
		sc.nextLine();
		
		System.out.println("Enter second student details");
		System.out.println("Enter Name -");
		String name1=sc.next();
		System.out.println("Enter Department -");
		String department1=sc.next();
		System.out.println("Enter the number of subjects");
		int subjects1=sc.nextInt();
		System.out.println("Enter the marks");
		int[] marks1 = new int[subjects1];
		
		

		for(int i=0;i<subjects1;i++) {
			marks1[i]=sc.nextInt();
		}
		
		System.out.println("Details of first student");
		Student student = new Student(name,department);
		student.printDetails();
		String grade=student.getGrades(marks);
		System.out.println(grade);
		
		
		System.out.println("Details of second student");
		Student student2 = new Student(name1,department1);
		student2.printDetails();
		String grade1=student.getGrades(marks1);
		System.out.println(grade1);

		
		sc.close();

	}

}
