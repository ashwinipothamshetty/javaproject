package com.voterapp.main;

import com.voterapp.exceptions.InValidVoterException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

public class voter {

	public static void main(String[] args) throws InValidVoterException {
		IElectionBoothService electionBoothService = new ElectionBoothServiceImpl();
		try {
		boolean checkeligibility=electionBoothService.checkEligibility(19,"MG road",17899);
			if(checkeligibility) {
				System.out.println("voter is eligible");
			}
		}catch(InValidVoterException e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
