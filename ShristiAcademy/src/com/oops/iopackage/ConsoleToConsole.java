package com.oops.iopackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToConsole {

	public static void main(String[] args) {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("Enter data");
		try {
			char a=(char)bufferedReader.read();
			do {
				System.out.print(a);
				a=(char)bufferedReader.read();
			}while(a!='s');
			System.out.println(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
