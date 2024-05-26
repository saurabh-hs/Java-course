package com.app;

class Person {
	public Person() {
		System.out.println("Person constructor");
	}
}

class Student extends Person {
	public Student() {
		System.out.println("Student constructor");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Student student = new Student();
		//Output:
		//Person Constructor
		//Student Constructor
	}

}
