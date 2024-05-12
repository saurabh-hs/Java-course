package com.app;

import java.util.Scanner;

public class Square implements Shape {
	private static double side;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square sq = new Square();
		
		System.out.println("Please enter side of square: ");
		side = sc.nextInt();
		
		System.out.println("Area of square: "+sq.calculateArea(side));
		
		System.out.println("Perimeter of square: "+sq.calculatePerimeter(side));
		
		sc.close();		
	}

	//Method use to calculate area of square
	@Override
	public double calculateArea(double side) {
		return side * side;
	}
	
	//Method use to calculate perimeter of square
	@Override
	public double calculatePerimeter(double side) {
		return 4 * side;
	}

}
