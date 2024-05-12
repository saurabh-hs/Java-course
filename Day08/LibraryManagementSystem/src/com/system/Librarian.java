package com.system;

public class Librarian {
	protected int employeeID;
	protected String name;
	protected String email;
	protected int phone;
	
	public Librarian() {
		this.employeeID = 0;
		this.name = "None";
		this.email = "None";
		this.phone = 0;
	}
	
	public Librarian(int employeeId, String name, String email, int phone) {
		this.employeeID = employeeId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getLibrarianDetails(int employeeID) {
		if(this.employeeID == employeeID) 
			return "Employee Details: [Employee ID: "+this.employeeID+" Name: "+this.name+" Email ID: "+this.email+" Phone no: "+this.phone+"]";
		else
			return "Employee is not available!!";
	}
	
	public String getLibrarianEmail(int employeeID) {
		if(this.employeeID == employeeID)
			return this.email;
		else
			return "Employee is not available!!";
	}

}
