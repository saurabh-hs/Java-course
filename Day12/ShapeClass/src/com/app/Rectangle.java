package com.app;

public class Rectangle extends Shape {
	int length = 10;
	int breath = 20;
	public void getArea() {
		System.out.println("Area of rectangle: "+(2 * length * breath)); 
	}
}
