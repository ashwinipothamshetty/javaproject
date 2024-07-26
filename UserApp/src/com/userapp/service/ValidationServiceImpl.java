package com.userapp.service;

import com.userapp.exception.NameNotExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if (password.length() < 6) {
			throw new TooShortException("password length is too short");
		} else if (password.length() > 15) {
			throw new TooLongException("password length is too Long");

		} else {
			return true;
		}
	}

	@Override
	public boolean validateUserName(String UserName) throws NameNotExistsException {
		boolean userNameExists = false;
		String userNames[] = new String[] { "Ashwini", "sunil", "siri", "arya" };
		for (String username1 : userNames) {
			if (username1.equalsIgnoreCase(UserName) ){
				userNameExists=true;
				break;
			} 
		}
		if(!(userNameExists)) {
			throw new NameNotExistsException();
			
		}
		return userNameExists;

	}

}
