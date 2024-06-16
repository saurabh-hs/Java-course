package com.app;

public class Complex {
	//Fields of Complex class
	private double imaginary;
	private double real;
	
	//Constructor of Complex class
	public Complex(double imaginary, double real) {
		this.imaginary = imaginary;
		this.real = real;
	}
	
	//Method to add two complex numbers
	public Complex add(Complex other) {
		double newReal = this.real + other.real;
		double newImaginary = this.imaginary + other.imaginary;
		return new Complex(newImaginary, newReal);
	}
	
	//Method to represent Complex number as a String
	@Override
	public String toString() {
		return this.real+" + "+this.imaginary+"i";
	}

	public static void main(String[] args) {
		//Create object of Complex class
		Complex num1 = new Complex(2.4,3.6);
		Complex num2 = new Complex(3.2,4.5);
		
		//Adding the two complex numbers using the add method
		Complex result = num1.add(num2);
		
		//Printing the result
		System.out.println("The sum of "+num1+" and "+num2+" is "+result);
	}

}
