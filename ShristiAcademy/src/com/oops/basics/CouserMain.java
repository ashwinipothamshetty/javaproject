package com.oops.basics;

public class CouserMain {

	public static void main(String[] args) {

		
		Course course=new Course();
		course.courseName="java";
		String[] listOfCourses=course.viewcourses();
		
		for(String courses : listOfCourses) {
			System.out.println(courses);
		}
	}

}
