package com.java.tutorials;

import java.util.ArrayList;


//Program to filter the employees on the basis of gender from the Employees List, using the concept of Encapsulation
class EmployeeDetails {
	private int id;
	private int salary;
	private String name;
	private String gender;
	
	public EmployeeDetails(int id, int salary, String name, String gender) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.gender = gender;
	}
	public boolean isMale() {
		if(this.gender=="M") {
			return true;
		}
		return false;
	}
	public boolean isFemale() {
		if(this.gender=="F") {
			return true;
		}
		return false;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return this.gender;
	}
	
	@Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Employee Id:- " + getId() + " Gender:- " + getGender() + " Name:- " + getName());
        return str.toString();
    }
}

public class FilterGender{
	public static void main(String [] args) {
		ArrayList<EmployeeDetails> arrayList = new ArrayList<EmployeeDetails>();
		arrayList.add(new EmployeeDetails(1, 2000, "Ram","M"));
		arrayList.add(new EmployeeDetails(2, 2000, "Ram","M"));
		arrayList.add(new EmployeeDetails(3, 2000, "Ram","M"));
		arrayList.add(new EmployeeDetails(4, 2000, "Ram","M"));
		arrayList.add(new EmployeeDetails(5, 2000, "Ram","M"));
		arrayList.add(new EmployeeDetails(6, 2000, "Ram","M"));
		arrayList.add(new EmployeeDetails(7, 2000, "Ram","M"));
		arrayList.add(new EmployeeDetails(8, 2000, "Simran","F"));
		arrayList.stream().filter(e -> e.isMale()).forEach(System.out::println);
		
	}
}