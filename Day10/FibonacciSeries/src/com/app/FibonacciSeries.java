package com.app;

import java.util.Scanner;

/*
 * Develop a Java program to print the Fibonacci series up to n terms using a for loop.
 */

public class FibonacciSeries {
	
//	public static int fibSeries(int n) {
//		if(n == 0 || n == 1)
//			return n;
//		
//		return fibSeries(n - 1) + fibSeries(n - 2);
//		
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number: ");
		int n = sc.nextInt();
		int prev = 0, next = 1;
		
		System.out.println("Fibonacci series up to "+n+" terms: ");
		
		for(int i=1; i<=n; i++) {
			System.out.print(next+" ");
			int sum = prev + next;
			prev = next;
			next = sum;
		}
		
		sc.close();
		
		//System.out.println("Fibonacci is: "+fibSeries(n));

	}

}