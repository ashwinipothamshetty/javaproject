package com.userapp.service;

import com.userapp.exception.NameNotExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public interface IValidationService {
	boolean validatePassword(String password) throws TooShortException, TooLongException;
	boolean validateUserName(String UserName) throws NameNotExistsException;
	

}
