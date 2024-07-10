package com.shristi.scan;

import java.util.Scanner;

public class Uniquenames {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] names = new String[] { "Ashwini", "sunil", "siri", "arya", "manoj" };

		System.out.println("Enter name to register : ");
		String newName = sc.next();
		boolean isUnique = true;

		for (String username : names) {
			if (username.equalsIgnoreCase(newName)) {
				isUnique =false;
				break;

			}

		}

		sc.close();
		
		if(isUnique) {
			System.out.println("Registered successfully");
		}else {
			System.out.println("your name is not unique");
		}
	}

}
