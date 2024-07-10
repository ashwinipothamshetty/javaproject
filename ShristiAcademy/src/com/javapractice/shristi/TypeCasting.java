package com.javapractice.shristi;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=10 , b=20;
		byte c=(byte) (a+b);
		
		System.out.println(c);
		
	int x=100;
	int y=200;
	
	byte z=(byte) (x+y); //it should give 300 but it ranges from -127 to +127
	System.out.println(z); // 
	}

}
