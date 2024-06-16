package com.app;

//Method Overloading:
//1. In method overloading number of parameters, sequence of parameter, data type of parameter are consider.
//2. Return type of method is not consider in method overloading.

public class MethodOverloading {
	
	//Method to add two integer numbers
	public static void add(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	
	/* Return type not consider in method overloading
	public static int add(int x, int y) {
		return (x + y);
	}
	*/
	
	//Method to add two double numbers
	public static void add(double a, double b) {
		System.out.println("Addition: "+(a+b));
	}
	
	//Method to add one int, one double & one float number
	public static void add(int a, double b, float c) {
		System.out.println("Addition: "+(a+b+c));
	}

	public static void main(String[] args) {
		add(12,30);
		add(12.4, 34.5);
		add(12,13.5,35.8f);

	}

}
