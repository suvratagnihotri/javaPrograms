package com.java.tutorials;

import java.util.Scanner;
//Program to reverse the letters of words of the string
public class ReverseTheLetters {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something");
		String inputString = sc.nextLine();
		String outputString = reverseLetters(inputString);
		System.out.println(outputString);
	}
	public static String reverseLetters(String inputString) {
		String outputString = "";
		String string[] = inputString.split(" ");
		for(int i=0; i<string.length; i++) {
			char subString[] = string[i].toCharArray();
			int min = 0;
			int max = subString.length-1;
			char temp;
			while(min<max) {
				temp = subString[min];
				subString[min] = subString[max];
				subString[max] = temp;
				max--;
				min++;
			}
			string[i] = String.valueOf(subString);
			outputString = outputString  + string[i] + " ";
		}
		
		return outputString;
	}
}
