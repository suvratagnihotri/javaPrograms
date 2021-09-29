package com.java.tutorials;


//Program to Override toString method of the Object class
public class OverridingToString {
	public static void main(String [] args) {
		Fields fields = new Fields("Sushant", 21);
		System.out.print(fields);
	}
}

class Fields{
	private String name;
	private Integer id;
	
	Fields(String name, Integer id){
		this.name = name;
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	//Overriding toString() method of object class
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Name: -"+getName() + " ID:-" + getId());
		return str.toString();
	}
}
