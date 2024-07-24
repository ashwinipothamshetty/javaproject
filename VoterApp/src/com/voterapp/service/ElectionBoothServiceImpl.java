package com.voterapp.service;

import com.voterapp.exceptions.InValidVoterException;
import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NoVoterIdException;
import com.voterapp.exceptions.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	String[] localities = { "RR nagar", "MG road", "Thillai nagar" };

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException {
		if (!(checkAge(age))) {
			throw new UnderAgeException("Age is below than 18");
		} else if (!(checkVoterId(voterId))) {
			throw new NoVoterIdException("Voter id is not valid");
		} else if (!(checkLocality(locality))) {
			throw new LocalityNotFoundException("locality is not proper");
		}
		return true;

	}

	private boolean checkAge(int age) throws UnderAgeException {
		if (age > 18) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		boolean isLocationPresent = false;
		for (String location : localities) {
			if (locality.equalsIgnoreCase(location)) {
				isLocationPresent = true;
			}
		}
		return isLocationPresent;
	}

	private boolean checkVoterId(int voterId) throws NoVoterIdException {
		if (voterId > 1000 && voterId < 9999) {
			return true;

		} else {
			return false;
		}
	}
}
