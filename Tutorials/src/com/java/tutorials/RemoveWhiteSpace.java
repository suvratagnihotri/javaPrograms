package com.java.tutorials;


import java.util.Scanner;
//Program to remove white spaces from a given string
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text");
		String inputString = sc.nextLine();
		removeWhiteSpaces(inputString);
	}
	public static void removeWhiteSpaces(String inputString) {
		char [] string = inputString.toCharArray();
		for(int i=0; i<inputString.length(); i++) {
			if(string[i]==' ') {
				int j = i;
				while(string[j]==' ' && j<inputString.length()-1){
					j++;
				}
				string[i]=string[j];
				string[j]=' ';
			}
		}
		System.out.println(string);
	}

}
