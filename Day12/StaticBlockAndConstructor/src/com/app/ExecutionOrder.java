package com.app;

public class ExecutionOrder {
	
	 // Static field
	static int staticField;
	
	//Non static field
	int nonStaticField;
	
	//static block
	static {
		System.out.println("Static block executed");
		staticField = 10;
	}
	
	//Parameterized constructor
	public ExecutionOrder(int value) {
		System.out.println("Constructor executed");
		nonStaticField = value;
	}

	public static void main(String[] args) {
		System.out.println("Main method executed");
		ExecutionOrder order = new ExecutionOrder(20);
		
		System.out.println("Static field value: "+staticField);
		System.out.println("Non static field value: "+order.nonStaticField);
	}

}
