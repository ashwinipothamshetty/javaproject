package com.shristi.intface2;

public class InterDemo {

	public static void main(String[] args) {
		IMobile mobile = new SmartPhone();
		mobile.call();
		mobile.message();
		SmartPhone smartPhone=(SmartPhone) mobile;
		String [] arr=smartPhone.showApps();
		for (String app : arr) {
			System.out.println(app);
		}
		smartPhone.watch();
	}

}
