package com.app;

import java.util.Scanner;

public class Person {
	//Field of Person class
	private int age;
	
	//setter for age field
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter for age field
	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
		//Create object of Scanner class
		Scanner sc= new Scanner(System.in);
		
		//Create object of person class
		Person person = new Person();
		
		try {
			//Take input from a user
			System.out.println("Please enter age: ");
			int age = sc.nextInt();
			
			//Check if user enter invalid age
			if(age < 0) {
				//if user enter invalid age InvalidAgeException throw
				throw new InvalidAgeException("Age can not be negative. Please enter a valid age");
			}else {
				//if user enter valid age set age and print age
				person.setAge(age );
				System.out.println("Age: "+person.getAge());
			}
			
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}finally {
			//close resource
			sc.close();
		}

	}

}
