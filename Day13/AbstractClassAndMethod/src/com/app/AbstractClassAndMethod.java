package com.app;

//Abstract class Shape
abstract class Shape {
	//Abstract method area
	//abstract method contain only declaration do not contain body of the method
	//The class which extends abstract class compulsory need to implement abstract method
	public abstract double area();
}

class Rectangle extends Shape {
	//Fields for Rectangle class
	private double length;
	private double width;
	
	//Constructor for Rectangle class
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;		
	}

	//Implementation of area method for Rectangle class
	@Override
	public double area() {	
		return length * width;
	}
	
}

class Circle extends Shape {
	//Field of circle class
	private double radius;
	
	//Constructor for Circle class
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Implementation of area method for Circle class
	@Override
	public double area() {
		return Math.PI * Math.sqrt(radius);
	}
	
}

public class AbstractClassAndMethod {

	public static void main(String[] args) {
		//Create Rectangle class object
		Rectangle r1 = new Rectangle(15.4, 23.8);
		System.out.println("Area of rectangle: "+r1.area());
		
		//Create Circle class object
		Circle c1 = new Circle(20);
		System.out.println("Area of cicle: "+c1.area());

	}

}
