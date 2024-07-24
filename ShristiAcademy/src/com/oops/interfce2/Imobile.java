package com.oops.interfce2;

public interface Imobile {
	void call();
	void sendSMS();
	default void payBills(){
		System.out.println("Pay bills");
		
	}
	default void playGames() {
		System.out.println("Playing brick game");
	}

}
