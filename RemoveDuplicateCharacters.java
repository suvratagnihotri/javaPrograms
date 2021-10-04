package com.java.tutorials;

import java.util.Scanner;
//Program to remove duplicate characters from a string.


public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String inputString = sc.nextLine();
		String newString = removeDuplicateCharacters(inputString);
		System.out.println(newString);

	}

	private static String removeDuplicateCharacters(String inputString) {
		char [] string = inputString.toCharArray();
		String newString = "";
		for(int i =0; i<string.length; i++) {
			for(int j = i+1; j<string.length; j++) {
				if(string[i]==string[j]) {
					string[j] = ' ';
				}
			}
		}
		for(int i=0; i<string.length; i++) {
			if(string[i]!=' ') {
				newString = newString + string[i];
			}
		}
		return newString;
	}

}
