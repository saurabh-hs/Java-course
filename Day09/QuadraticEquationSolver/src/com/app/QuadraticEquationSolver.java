package com.app;

import java.util.Scanner;

public class QuadraticEquationSolver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the cofficients of the quadratic equation (a,b,c): ");
		double a = sc.nextDouble();
		
		double b = sc.nextDouble();
		
		double c = sc.nextDouble();
		
		double discriminant = b * b - 4 * a * c;
		
		if(discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("Roots are real and different: ");
			System.out.println("Root1 = "+root1);
			System.out.println("Root2 = "+root2);
		}else if(discriminant == 0) {
			double root = -b / (2 * a);
			System.out.println("Roots are real and different: ");
			System.out.println("Root= "+root);
		}else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("Roots are complex: ");
			System.out.println("Root1 = "+realPart+"+"+imaginaryPart+"i");
			System.out.println("Root2 = "+realPart+"-"+imaginaryPart+"i");
		}
		
		sc.close();
	}

}
