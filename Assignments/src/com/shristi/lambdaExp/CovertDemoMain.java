package com.shristi.lambdaExp;

public class CovertDemoMain {

	public static void main(String[] args) {
		IFileConverter fileConverter = () -> {
			System.out.println("converted to zip");
		};
		fileConverter.convertFile();
		
		//2nd implementation
		fileConverter = () -> {
			System.out.println("converted to JAR");
		};
		fileConverter.convertFile();
		
		//3rd implementation
		fileConverter = () -> {
			System.out.println("converted to WAR");
		};
		fileConverter.convertFile();
	}

}
