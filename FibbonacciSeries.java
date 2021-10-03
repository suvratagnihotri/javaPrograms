package com.java.tutorials;

//Program to print Fibbonacci series of n numbers.

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a = 0; 
		int b =1;
		int fib = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i=0; i<10; i++) {
			fib = a + b;
			a = b;
			b = fib;
			System.out.print(fib + " ");
		}
		

	}

}
