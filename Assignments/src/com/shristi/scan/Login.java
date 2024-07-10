package com.shristi.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[] {"ashwini","sunil" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to login : ");

		String name = sc.next();
		sc.close();
		boolean usernameExists = false;

		for (String username : names) {
			if (username.equalsIgnoreCase(name)){
				usernameExists = true;
				break;
			}

		}

		if ((usernameExists)) {
			System.out.println("You are logged in successfully");

		} else {
			System.out.println("Invalid username");
		}
	}

}
