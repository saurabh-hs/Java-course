package com.app;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	//Field of Person class
	int age;
	String name;
	String country;
	
	//Constructor of Person class
	public Person(int age, String name, String country) {
		this.age = age;
		this.name = name;
		this.country = country;
	}
	
	public int getAge() {
		return age;
	}



	public String getName() {
		return name;
	}



	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", country=" + country + "]";
	}

	
	@Override
	public int compareTo(Person that) {
		if(this.age == that.age && this.name.equals(that.name)) {
			return this.country.compareTo(that.country);
		}else if(this.age == that.age) {
			return this.name.compareTo(that.name);
		}
		return this.age - that.age;
	}

	
	
//	public String toString() {
//		return "Age: "+age+" Name: "+name+" Country: "+country+"\n";
//	}
	
	
	
}
