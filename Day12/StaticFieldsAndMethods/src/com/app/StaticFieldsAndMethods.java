package com.app;

public class StaticFieldsAndMethods {
	
	public static void main(String[] args) {	
		DemoClass demo = new DemoClass();
		
		//To access instance varible need to create object
		demo.num = 15;
		//To access instance method need to create object
		demo.print1(demo.num);
		
		//we can access static variable with class name do not need to create object
		DemoClass.num1= 20;
		
		//we can access static method with class name do not need to create object
		DemoClass.print(DemoClass.num1);
	}

}

class DemoClass {
	int num = 12;
	static int num1 = 14;
	
	static void print(int num) {
		System.out.println("Static print method!! "+num);
	}
	
	void print1(int num1) {
		System.out.println("Non static method!! "+num1);
	}
	
}
