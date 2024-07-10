package com.shristi.objbasics;

public class Book {

	String title, author, category;
	int price;
	
	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Title " + title + " ,Author "+ author + " ,Category" + category +" ,Price"+ price );
	}
	
	void checkBookType() {
		if(price>500) {
			System.out.println("Premium Book");
			
		}
		else {
			System.out.println("Standarad Book");
		}
	}
}
