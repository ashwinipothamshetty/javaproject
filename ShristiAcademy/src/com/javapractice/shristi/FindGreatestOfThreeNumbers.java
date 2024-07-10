package com.javapractice.shristi;

public class FindGreatestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 20, n2 = 40, n3 = 30;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
        
        
        //using ternary operator
        
        String result =(n1>n2) && (n1>n3) ?  "a is greater" :(n2>n3) ? "b is greater" : "c is greater";
        System.out.println(result);

	}

}
