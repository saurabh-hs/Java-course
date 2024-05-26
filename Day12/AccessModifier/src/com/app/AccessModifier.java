package com.app;

//Base class shape
class Shape {
	//protected field
	protected String color;
	
	//method to display the color
	public void displayColor() {
		System.out.println("The color of the shape is: "+color);
	}
}

//Derived class circle
class Circle extends Shape {
	//Constructor to set the color
	public Circle(String color) {
		this.color = color;
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		//create an instance of circle and set the color
		Circle circle = new Circle("Orange");
		
		//call the displayColor method
		circle.displayColor();
		
		//Output: The color of the shape is: Orange
	}

}
