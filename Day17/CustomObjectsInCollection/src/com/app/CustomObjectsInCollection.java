package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Create a Person class with name and age attributes. Create a List of Person objects and sort it by name and then by age.
 */

class Person {
	//Field of Person class
	private String name;
	private int age;
	
	//Constructor of Person class
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//Override toString method for easy printing
	@Override
	public String toString() {
		return "Person{Name: "+name+" , age: "+age+"}";
	}
}

public class CustomObjectsInCollection {

	public static void main(String[] args) {
		//Create object of Person class
		List<Person> people = new ArrayList<>();
		
		//Add Person data into ArrayList
		people.add(new Person("Leo",24));
		people.add(new Person("Alice",34));
		people.add(new Person("Bob",21));
		people.add(new Person("Charlie",43));
		people.add(new Person("Alice",23));
		people.add(new Person("Leo",65));
		
		//sort the list by name
		Collections.sort(people, Comparator.comparing(Person::getName));
		System.out.println("List sorted by name: ");
		for(Person person : people) {
			System.out.println(person);
		}
		
		//sort the list by name, then by age
		Collections.sort(people, Comparator.comparing(Person :: getName).thenComparing(Person :: getAge));
		System.out.println("\nList sorted by name and then by age: ");
		for(Person person : people) {
			System.out.println(person);
		}

	}

}
