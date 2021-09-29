package com.java.tutorials;
//Program to write the elements of array array[] = {1,2,3,4,5,6}; in following sequence 
//1234
//5612
//3456
//1234
//5612
//3456
//1234
public class ArrayIteration {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6};
		int count =0;
		for(int j =0; j<7; j++) {
			for(int i=0; i<4; i++) {
				System.out.print(array[count]);
				count++;
				if(count==6) {
					count=0;
				}
			}
			System.out.println();
		}
		
		

	}

}
