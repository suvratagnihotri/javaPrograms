package com.java.tutorials;



//Program to check whether a number is armstrong or not

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a = 153;
		int temp = a;
		int b = 0;
		int rem = 0;
		while(temp>0) {
			rem = temp%10;
			System.out.println("Remainder is "+ rem);
			b = b + rem*rem*rem;
			System.out.println("b is " +b);
			temp = temp/10;
			System.out.println("temp is "+ temp);
		}
		if(b==a) {
			System.out.println(a + " Number is Armstrong");
		}
		else {
			System.out.println(a + " Number is not Armstrong");
		}

	}
}
