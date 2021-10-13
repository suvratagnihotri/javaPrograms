package com.java.tutorials;

//Program to print the sum of all elements of an array.
public class SumOfArrayElements {
	public static void main(String[] args) {
		int array [] = {2,5,4,3,1,2,7,9,10};
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of all elements of array is : "+sum);
	}
}
