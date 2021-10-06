package com.java.tutorials;

import java.util.Arrays;
import java.util.Scanner;
//Program to insert an element at given position in to an array.

public class InsertInArray {

	public static void main(String[] args) {
		int array[]= new int[100];
		int n=10;
		for(int i=0; i<n; i++) {
			array[i] = i;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element :");
		int number = sc.nextInt();
		System.out.println("Enter the position between 1 to 10 :");
		int position = sc.nextInt();
		n++;
		for(int i=n-1; i>=position; i--) {
			array[i] = array[i-1];
		}
		array[position-1] = number ;
		 System.out.print(Arrays.toString(array));
		
		

	}

}
