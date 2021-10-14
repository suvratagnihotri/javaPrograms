package com.java.tutorials;
//Program to print the following pattern-
/*  *****
 *  ****
 *  ***
 *  **
 *  *
 */
public class Pattern1 {
	public static void main(String [] args) {
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
