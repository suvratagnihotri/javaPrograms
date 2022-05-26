package com.java.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Program to check null reference of Objects and remove null values from a given List of Integers.

public class NullReferences {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,null,3,4,null,5,6,null);
		List<Integer> outputIntegers = eventIntegers(integers);
		System.out.println(outputIntegers);

	}

	private static List<Integer> eventIntegers(List<Integer> integers) {
		if(integers==null) {
			return Collections.EMPTY_LIST;
		}
		List<Integer> outputIntegers = new ArrayList<>();
		for(Integer in : integers) {
			if(in!=null) {
				outputIntegers.add(in);
			}
		}
		return outputIntegers;
	}

}
