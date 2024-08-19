package com.oops.iopackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFile {

	public static void main(String[] args) {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter data");
		FileWriter fileWriter=null;
		try {
			 fileWriter = new FileWriter("demo.txt");
			String result = bufferedReader.readLine();
			fileWriter.write(result);
			do {
				System.out.println(result);
				result = bufferedReader.readLine();
				fileWriter.write(result);

				
			}while(!(result.equalsIgnoreCase("stop")));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fileWriter!=null)
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		}

	}

}
