package com.java.tutorials;
//Program to check that a number is palindrome or not.


public class PalindromeNumber {

	public static void main(String[] args) {
		int a = 261;
		int temp = a;
		int b = 0;
		int rem = 0;
		while(temp>0) {
			rem = temp%10;
			System.out.println("Remainder is "+ rem);
			b = b*10 + rem;
			System.out.println("b is " +b);
			temp = temp/10;
			System.out.println("temp is "+ temp);
		}
		if(b==a) {
			System.out.println(a + " Number is Plaindrome");
		}
		else {
			System.out.println(a + " Number is not Plaindrome");
		}

	}

}
