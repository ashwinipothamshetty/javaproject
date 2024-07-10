package com.javapractice.shristi;

public class CmdLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=args[0];
		System.out.println("name"+ name);
		int age=Integer.parseInt(args[1]);
		System.out.println(" Age is " +age);
		double salary = Double.parseDouble(args[1]);
		System.out.println(" salary " +salary);

	}

}
