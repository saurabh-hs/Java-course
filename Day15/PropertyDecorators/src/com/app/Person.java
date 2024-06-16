package com.app;

public class Person {
	//Private Field of Person class
	private int age;
	
	//Getter method for age
	public int getAge() {
		return age;
	}
	
	//Setter method for age with validation
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("Age cannot be negative. Please provide a valid age");
		}else {
			this.age = age; 
		}
	}
	

	public static void main(String[] args) {
		//Create a object of person class
		Person person = new Person();
		
		//Set age using the setter method
		person.setAge(24);
		
		//Get age using the getter method
		System.out.println("Age: "+person.getAge());
		
		//Attempt to set an invalid age
		person.setAge(-5);
		
		//Get age again to see if it was updated
		System.out.println("Age after attempting to set invalid value: "+person.getAge());

	}

}
