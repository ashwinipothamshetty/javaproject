package com.shristi.intface2;

public interface IMobile {
	void call();

	void message();
}

interface ISmartMobile extends IMobile {
	String[] showApps();

	void watch();

}