package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameNotExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) throws NameNotExistsException, TooLongException, TooShortException {
		System.out.println("Enter userName");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		

		IValidationService iValidationService = new ValidationServiceImpl();
		boolean userNameValidate=iValidationService.validateUserName(name);
		boolean passwordValidate=iValidationService.validatePassword(password);	
		if(passwordValidate && userNameValidate) {
			System.out.println("welcome user");	
		}
		}
		
		

}