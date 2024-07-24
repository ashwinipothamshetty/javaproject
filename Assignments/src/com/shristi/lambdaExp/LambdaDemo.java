package com.shristi.lambdaExp;

public class LambdaDemo {
	public static void main(String[] args) {
		Icourse icourse=()->{
			String [] arr1= {"HTML","CSS","Javascript"};
			return arr1;
		};
		String[] result=icourse.showCourses();
		for (String course : result) {
			System.out.println(course);
			
		}
		
		icourse =()->{
			String [] arr2= {"MySQL", "mongodb"};
			return arr2;
		};
		String[] result1=icourse.showCourses();
		for (String course : result1) {
			System.out.println(course);
			
		}
		
		icourse =()->{
			String [] arr3= {"Java", "Spring"};
			return arr3;
		};
		String[] result2=icourse.showCourses();
		for (String course : result2) {
			System.out.println(course);
			
		}
	}
	
	
}
