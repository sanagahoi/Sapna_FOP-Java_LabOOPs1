package com.itSupport.email.modal;

public class Employee {
	String firstName;
	String lastName;
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public String getlastName() {
		return lastName;
}
	public void setlastName( String lastName) {
		this.lastName = lastName;
		
	}
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName =lastName;
	}
}