package com.oops.Inheritance;

public class InheritanceMobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobile =new Mobile("model-1", 10000, "oppo");
		mobile.print();
		
		SmartPhone smartPhone=new SmartPhone("model-2", 50000, "Iphone" ,"os type-1","supercamera");
		smartPhone.print();
		smartPhone.showFeatures();
		

	} 	

}
