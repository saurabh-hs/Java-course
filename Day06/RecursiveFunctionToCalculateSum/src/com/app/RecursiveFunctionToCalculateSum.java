package com.app;

import java.util.Scanner;

//Write a recursive function to calculate sum of first n natural numbers

public class RecursiveFunctionToCalculateSum {
	private static final Scanner scanner = new Scanner(System.in);
	
	
	public static int sumRecursive(int n) {
		if(n == 0) {
			return 0;
		}else {
			return n + sumRecursive(n -1);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Please enter a number : ");
		int n = scanner.nextInt();
		
		int sum = sumRecursive(n);
		System.out.println("Sum of "+n+" natural number is "+sum);
		
		scanner.close();
	}

}
