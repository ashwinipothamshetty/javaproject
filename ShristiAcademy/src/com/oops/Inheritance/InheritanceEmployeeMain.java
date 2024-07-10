package com.oops.Inheritance;

public class InheritanceEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InEmployee inEmployee=new InEmployee("Ram",10);
		inEmployee.printDetails();
		
		InManager inManager=new InManager("priya",20, 50000);
		inManager.printDetails();
		inManager.calBonus(10000);
		
	}

}
