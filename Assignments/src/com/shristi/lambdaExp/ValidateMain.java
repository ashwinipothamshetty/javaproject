package com.shristi.lambdaExp;

public class ValidateMain {

	public static void main(String[] args) {
		IValidator validator = (userName) -> {
			String[] usernames = { "Tom", "Ronnie", "John", "Jack" };
			boolean validateName = false;
			for (String username2 : usernames) {
				if ((username2.equalsIgnoreCase(userName))) {
					validateName = true;
					break;
				}
			}
			if (validateName) {
				System.out.println("validated");
			} else {
				System.out.println("Invalid Name");
			}
		};

		validator.validateUser("Ash");

	}

}
