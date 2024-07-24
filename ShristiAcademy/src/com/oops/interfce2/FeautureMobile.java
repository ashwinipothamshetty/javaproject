package com.oops.interfce2;

public class FeautureMobile implements Imobile {

	@Override
	public void call() {
		System.out.println("Calling");
	}

	@Override
	public void sendSMS() {
		System.out.println("Sending SMS");
	}
	
	@Override
	public void playGames() {
		System.out.println("Playing Mario game");
	}

}
