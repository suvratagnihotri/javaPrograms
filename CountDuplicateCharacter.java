//Write a program that counts duplicate characters from a given string
package com.java.tutorials;

import java.util.Scanner;

public class CountDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text");
		String input = sc.nextLine();
		DuplicateCharacter duplicateCharacter = new DuplicateCharacter();
		duplicateCharacter.countCharacter(input);
	}

}

class DuplicateCharacter{
	public int countCharacter(String str) {
		char stringArray[] = str.toCharArray();
		int count;
		for(int i=0; i<stringArray.length; i++) {
			count = 1;
			for(int j=i+1; j<stringArray.length; j++) {
				if(stringArray[i]==stringArray[j] && stringArray[i]!=' ') {
					count++;
					stringArray[j]='0';
				}
				
			}
			if(count>1 && stringArray[i]!='0') {
				System.out.println(stringArray[i] +" : " + count);
			}
		}
		return 0;
	}
}
