package com.java.tests;

import com.java.tutorials.*;
//Program to import class from another package and use it.
public class ImportClass {

	public static void main(String[] args) {
		RemoveSpaces removeSpaces = new RemoveSpaces();
		String stringWithoutSpace = removeSpaces.removeSpace("Ra     aammmm     mmmmmm");
		System.out.println(stringWithoutSpace);
		
	}

}
