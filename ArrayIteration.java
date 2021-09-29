package com.java.tutorials;

import java.lang.reflect.Array;
import java.util.Arrays;

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
		int tempCount =0;
		int arrayCount =0;
		int tempArray[] = new int[4];
		for(int j =0; j<tempArray.length*7; j++) {
			try {
				tempArray[tempCount] = array[arrayCount];
				tempCount++;
				arrayCount++;
				arrayCount = arrayCount %6;
			}
			catch(Exception e) {
				System.out.println(Arrays.toString(tempArray));
				tempCount = 0;
				j=j-1;
			}
			System.out.println();
		}
		
		

	}

}
