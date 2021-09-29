package com.java.tutorials;

public class AddingObjectTOArray {
	public static void main(String [] args) {
		ArrayFields [] array = new ArrayFields[10];
		array[0] = new ArrayFields("Suresh",2000);
		array[1] = new ArrayFields("Suresh",2000);
		array[2] = new ArrayFields("Suresh",2000);
		array[3] = new ArrayFields("Suresh",2000);
		array[4] = new ArrayFields("Suresh",2000);
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

class ArrayFields{
	private String name;
	private int salary;
	
	ArrayFields(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Name:- "+getName() + " Salary:- "+getSalary());
		return str.toString();
	}
}
