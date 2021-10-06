package com.java.tutorials;

import java.util.Scanner;

//Program to find subString in a given String .
public class FindSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Main string");
		String mainString = sc.nextLine();
		System.out.println("Enter a Sub-string");
		String subString = sc.nextLine();
		boolean containsSubstring = checkSubString(mainString, subString);
		if(containsSubstring) {
			System.out.println(mainString + " contains "+ subString);
		}
		
		
	}

	private static boolean checkSubString(String mString, String sString) {
		char [] mainString = mString.toCharArray();
		char [] subString = sString.toCharArray();
		for(int i=0; i< mainString.length; i++) {
			if(mainString[i]==subString[0]) {
				int tempMain = i;
//				int subCount = 0;
				for(int j = 0; j<subString.length; j++) {
					if(mainString[tempMain]!=subString[j]) {
						System.out.println("Not Found");
						j = subString.length;
					}
					if(mainString[tempMain]==subString[j]) {
						tempMain ++;
					}
				}
				if(tempMain-i==subString.length) {
					return true;
				}
			}
		}
		return false;
	}

}
