package com.app;

import java.util.Scanner;

/*
 * Create a Java program to calculate the factorial of a number n using a for loop.
 */

public class FactorialCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number: ");
		int n = sc.nextInt();
		
		int factorial = 1;
		
		for(int i = 1; i <= n; i++ ) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial is: "+factorial);
		
		sc.close();
	}

}
