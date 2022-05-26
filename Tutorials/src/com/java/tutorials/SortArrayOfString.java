package com.java.tutorials;

import java.util.Arrays;
//Program to sort the strings of String array acoording to their length.
public class SortArrayOfString {

	public static void main(String[] args) {
		String [] inputArray = {"Monday","Tuesday","Suvrat","Siddhant", "Harshit", "Abid"};
		String [] sortedArray = new String[inputArray.length];
		sortedArray = sortStringArray(inputArray);
		System.out.println(Arrays.asList(sortedArray));

	}
	
	private static String[] sortStringArray(String[] inputArray) {
		String temp ="";
		for(int i=0; i<inputArray.length; i++) {
			for(int j = i; j<inputArray.length; j++) {
				if(inputArray[i].length()>inputArray[j].length()) {
					temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}
			}
		}
		return inputArray;
	} 

}
