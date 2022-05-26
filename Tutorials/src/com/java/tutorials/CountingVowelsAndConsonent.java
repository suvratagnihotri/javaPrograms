package com.java.tutorials;

import java.util.Scanner;
//Program to filter number of Vowels and Consonant in a given string
public class CountingVowelsAndConsonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text:");
		String inputString = sc.nextLine();
		countConsonentAndVowels(inputString);
		
	}
	public static void countConsonentAndVowels(String inputString) {
		int vowels=0,consonants=0;
		for(int i=0; i<inputString.length(); i++) {
			char let = inputString.charAt(i);
			if(let=='a' || let =='e'|| let == 'i'||let =='o'|| let =='u' && let!=' ') {
				vowels++;
			}
			else if(let!=' '){
				consonants++;
			}
		}
		System.out.println("Vowels :"+vowels +" Consonents :" +consonants);
	}

}
