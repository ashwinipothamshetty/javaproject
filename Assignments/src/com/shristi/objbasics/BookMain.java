package com.shristi.objbasics;

public class BookMain {

	public static void main(String[] args) {

		Book book1=new Book("Title-1"," author-1", "category-1", 1000);
		book1.getDetails();
		book1.checkBookType();
		
		
		Book book2=new Book("Title-2"," author-2", "category-2", 100);
		book2.getDetails();
		book2.checkBookType();
	}

}
