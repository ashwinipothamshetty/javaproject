package com.shristi.intface2;

public class SmartPhone extends FeauturePhone {

	@Override
	public String[] showApps() {
		String[] arr = new String[] { "hotstar", "amazon-prime", "whatsup" };
		return arr;

	}

	@Override
	public void watch() {
		System.out.println("watching movie");
	}

	@Override
	public void call() {
		System.out.println("call through smartPhone");
	}

	@Override
	public void message() {
		System.out.println("message through smartPhone");

	}

}
