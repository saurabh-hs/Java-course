package com.app;

//Base class Employee
class Employee {
	//Fields for Employee class
	protected String name;
	protected double salary;
	
	//Constructor for Employee class
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//Method to display Employee details
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}

}

//subclass Manager
class Manager extends Employee {
	//Field for Manager class
	protected String department;
	
	//Constructor for Manager class
	public Manager(String name, double salary, String department) {
		//Call to superclass (Employee) constructor
		super(name, salary);
		this.department = department;				
	}
	
	//Method to display Manager details
	public void displayDetails() {
		//Call to superclass (Employee) displayDetails method
		super.displayDetails();
		System.out.println("Department: "+department);
	}
}

public class UsingSuperKeyword {

	public static void main(String[] args) {
		//Create a Manager object
		Manager mgr = new Manager("Jonh Wick",60000,"IT support");
		
		//display the details of the manager
		mgr.displayDetails();

	}

}
