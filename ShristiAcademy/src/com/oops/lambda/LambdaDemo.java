package com.oops.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		// Multiple lines
		Icourse course = () -> {
			String[] courses = { "Java", "Spring" };
			return courses;
		};
		String[] result = course.courses();
		for (String course1 : result) {
			System.out.println(course1);

		}

		// simple way
		course = () -> {
			return new String[] { "Java", "Spring" };
		};
		String[] result2 = course.courses();
		for (String course2 : result2) {
			System.out.println(course2);

		} // simplest way
		course = () -> new String[] { "Java", "Spring" };

//--------------------

		Icheck check = (user) -> {
			System.out.println("Check name " + user);
		};
		check.validateName("Ashwini");
	}
}
