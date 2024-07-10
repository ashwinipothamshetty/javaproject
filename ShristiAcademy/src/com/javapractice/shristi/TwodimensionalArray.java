package com.javapractice.shristi;

public class TwodimensionalArray {
	
	public static void main(String[] args) {
		int rows = 3;
        int cols = 3;
		int[][] array =new int[3][3];
		int value = 1;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value++;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("\nSum of all elements in the array: " + sum);
	}

	
}
