package com.java.tutorials;

import java.util.Scanner;
//Program to find the day of the week according to the given string , i.e. Monday -3
public class AddSubractFromWeekDays {

	public static void main(String[] args) {
		String[] days = {"Monday","Tuesday","wednesday","Thursday","Friday","Saturday","Sunday"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your day with operations");
		String day = sc.nextLine();
		String desiredDay = findTheDay(day, days);
		System.out.println(desiredDay);

	}
	
	public static String findTheDay(String day, String[] days) {
		char[] string = day.toCharArray();
		String inputDay ="";
		String inputDigit = "";
		String desiredDay = "";
		boolean subtract = false;
		for(int i=0; i<string.length; i++) {
			if(string[i]==' ') {
				int len =i+1;
				while(len<string.length) {
					if(string[len]=='-') {
						subtract = true;
						len++;
					}
					else {
						inputDigit = inputDigit + string[len];
						len++;
					}
				}
				i = len;
			}
			else {
				inputDay = inputDay + string[i];
			}
		}
		System.out.println("InputDay "+inputDay+"InputDigit "+ inputDigit);
		int digit = Integer.parseInt(inputDigit);
		int desiredDigit = digit % 7;
		int index =0;
		for(int j=0; j<days.length; j++) {
			System.out.println("Day is :" + days[j]);
//			System.out.println("InputDay is :" + inputDay);
			if(inputDay.equals(days[j])) {
				System.out.println("InputDay is :" + inputDay);
				index = j;
				if(subtract) {
					index = index - desiredDigit;
					desiredDay = days[Math.abs(index)];
				}
				else {
					index = index + desiredDigit;
					desiredDay = days[index];
				}
			}
		}
		return desiredDay;
	}

}
