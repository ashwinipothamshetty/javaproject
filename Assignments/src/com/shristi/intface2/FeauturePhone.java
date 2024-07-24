package com.shristi.intface2;

public class FeauturePhone implements ISmartMobile {

	@Override
	public void call() {
		System.out.println("calling");
	}

	@Override
	public void message() {
		System.out.println("message");
	}

	@Override
	public String[] showApps() {
		return null;
	}

	@Override
	public void watch() {
		System.out.println("watching vedio");
	}

}
