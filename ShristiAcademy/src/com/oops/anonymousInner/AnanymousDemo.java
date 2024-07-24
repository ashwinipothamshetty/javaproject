package com.oops.anonymousInner;

class Greet implements Igreeter {

	@Override
	public void sayHello(String username) {
		System.out.println("Hello" + username);
	}

}

public class AnanymousDemo {
	// normal way that class calls the methods which are overridden from interface
	public static void main(String[] args) {

	Igreeter igreeter = new Greet();
	igreeter.sayHello("Ashwini");

	// Anyonymous inner class providing implementation
	Igreeter igreeter2 = new Igreeter() {

		@Override
		public void sayHello(String username) {
			System.out.println("Hello" + username);
		}

	};
	
	//we should mandatorily call the method after providing the implementation
	igreeter2.sayHello("Siri");
	}
}