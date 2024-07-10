package com.shristi.scan;

import java.util.Scanner;

public class SquarerootArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int[] arr= new int[num];
		double[] arr2= new double[num];
		System.out.println("Enter the values of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.print("The original array elements are :");

		for(int i=0;i<arr.length;i++) {

		System.out.println(arr[i]);
		}
		
		
		for(int i=0;i<arr.length;i++){

		arr2[i]=(int) Math.sqrt(arr[i]);

			
		}
	
	
for(int i=0;i<arr.length;i++) {
	System.out.println("The square root of array elements are " +arr2[i]);
	}		

	}

}
