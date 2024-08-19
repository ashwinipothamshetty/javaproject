package com.oops.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Ash");
		list.add("siri");
		list.set(1,"sonu");
		list.add("100");
		for(Object element:list) {
			System.out.println((String)element);
		}
		
		Iterator<Object> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
