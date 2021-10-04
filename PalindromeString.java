package com.java.tutorials;

import java.util.Arrays;
import java.util.Scanner;

//Program to check that a string is Palindrome or not.

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String inputString = sc.nextLine();
		PalindromeString palindromeString = new PalindromeString();
		boolean palindrome = palindromeString.isPalindrome(inputString);
		if(palindrome) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
	}
	public boolean isPalindrome(String inputString) {
		char [] string = inputString.toCharArray();
		char [] newString = new char[string.length];
		for(int i = string.length-1; i>=0;i--) {
			newString[i] = string[string.length-1-i];
		}
		if(Arrays.equals(newString, string)) {
			return true;
		}
		return false;
	}

}
