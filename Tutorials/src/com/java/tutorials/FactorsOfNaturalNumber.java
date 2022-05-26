package com.java.tutorials;

import java.util.Scanner;


//Program to find all the divisors of a given natural number.
public class FactorsOfNaturalNumber {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an natural number ");
		int number = sc.nextInt();
		System.out.println(number +" is divisible by");
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				System.out.println(i);
			}
		}
	}
}
