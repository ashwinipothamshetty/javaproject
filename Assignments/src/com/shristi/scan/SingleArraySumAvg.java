package com.shristi.scan;

import java.util.Scanner;

public class SingleArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int[] arr= new int[num];
		System.out.println("Enter the values of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}

		for(int i=0;i<=arr.length-1;i++) {
			sum+=arr[i];
		}

		System.out.println("Sum of numbers in array :" + sum);
		
		int avg=sum/arr.length;
		System.out.println("Average of numbers in an array :" + avg);
	}

}
