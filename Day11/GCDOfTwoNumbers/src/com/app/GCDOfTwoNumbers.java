package com.app;

import java.util.Scanner;

/*
 * Write a program to find the Greatest Common Divisor (GCD) of two numbers using a while loop.
 */

public class GCDOfTwoNumbers {

	//Method to calculate gcd of two numbers
	static int gcdCalculate(int a, int b) {
		int min = 0; 

		//find minimum number between two numbers
		if(a < b) {
			min = a;
		}else {
			min = b;
		}
		
		//find GCD of two numbers
		while(min > 0) {
			if(a % min == 0 && b % min == 0) {
				break;
			}
			min--;
		}

		return min;

	}		


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Take two numbers from user as a input
		System.out.println("Please enter numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("GCD Of "+a+" and "+b+" is "+gcdCalculate(a,b));
		sc.close();

	}
}