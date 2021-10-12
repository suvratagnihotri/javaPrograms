package com.java.tutorials;

import java.util.Scanner;

//Program to remove spaces from a given string .
public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with spaces");
		String inputString = sc.nextLine();
		String stringWithoutSpace = new String();
		stringWithoutSpace = new RemoveSpaces().removeSpace(inputString);
		System.out.println(stringWithoutSpace);
	}

	public String removeSpace(String inputString) {
		char [] string = inputString.toCharArray();
		String outputString = "";
//		int i=0;
		for(int i=0; i<string.length; i++) {
			if(string[i]!=' ') {
				outputString = outputString + string[i];
			}
		}
		
		return outputString;
	}

}
