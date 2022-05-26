package com.java.tutorials;

//Program to check whether a number is perfect number or not.

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 496;
		int temp = 0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				temp= temp + i;
			}
		}
		if(temp==num) {
			System.out.print(num + " is a perfect number");
		}
		else {
			System.out.print(num + " is a not perfect number");
		}
	}

}
