package com.oops.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentMain {

	private static final Student Ashwini = null;

	public static void main(String[] args) {

		ArrayList<Student> list=new ArrayList<Student>();
		Student student1=new Student("Ashwini","CSE",1);
		Student student2=new Student("sonu","ECE",2);
		Student student3=new Student("siri","Civil",3);

		list.add(student1);
		list.add(student2);
		list.add(student3);
	
		for(Student s:list) {
			System.out.println(s);
		}
		ListIterator<Student> iterator=list.listIterator(list.size());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		;
		
		

	}

}
