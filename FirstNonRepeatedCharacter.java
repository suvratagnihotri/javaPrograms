package com.java.tutorials;

import java.util.Scanner;
//Program to get the first non repeated character from the String
public class FirstNonRepeatedCharacter {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter some text: ");
		String input = sc.nextLine();
		char nonRepeated = getNonRepeatedCharacter(input);
		System.out.print(nonRepeated);
	}
	
	public static char getNonRepeatedCharacter(String input) {
		int count;
		char string[] = input.toCharArray();
		for(int i=0; i<string.length; i++) {
			count = 0;
			for(int j =i+1; j<string.length; j++) {
				if(string[i]==string[j]) {
					count++;
					string[j]='0';
				}
			}
			if(count==0 && string[i]!='0') {
				return string[i];
			}
		}
		return ' ';
	}
	
}


