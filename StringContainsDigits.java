package com.java.tutorials;

import java.util.Scanner;
import java.lang.NumberFormatException;
//Program to check whether a string contains only digits or not
public class StringContainsDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text");
		String inputString = sc.nextLine();
		boolean onlyDigits = checkForDigits(inputString);
		System.out.print(onlyDigits);

	}
	
	public static boolean checkForDigits(String inputString) {
		for(int i=0; i<inputString.length(); i++) {
			try {
				int j = Integer.parseInt(String.valueOf(inputString.charAt(i)));
				System.out.println(j);
			}
			catch(NumberFormatException e){
				return false;
			}
		}
		return true;
	}

}
