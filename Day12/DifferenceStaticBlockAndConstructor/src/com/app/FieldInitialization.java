package com.app;

public class FieldInitialization {
	
	//static field
	static int staticField;
	
	//non static field
	int nonStaticField;
	
	//static block to initialize static field
	static {
		staticField = 100;
		System.out.println("static block: staticField = "+staticField);
	}
	
	//Constructor to initialize non static field
	public FieldInitialization(int value) {
		nonStaticField = value;
		System.out.println("Constructor: nonStaticField = " + nonStaticField);
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started.");
		
		//create first object
		FieldInitialization obj1 = new FieldInitialization(200);
		System.out.println("obj1 - staticField: "+staticField);
		System.out.println("obj2 - nonStaticField: "+obj1.nonStaticField);
		
		//create second object
		FieldInitialization obj2 = new FieldInitialization(300);
		System.out.println("obj2 - staticField: "+staticField);
		System.out.println("obj2 - nonStaticField: "+obj2.nonStaticField);

	}

}
