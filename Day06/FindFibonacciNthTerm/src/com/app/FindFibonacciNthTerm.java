package com.app;

import java.util.Scanner;

//write a function to print nth term of fibonacci series using recursion

public class FindFibonacciNthTerm {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
		System.out.println("Please enter a number : ");
		int a = scanner.nextInt();
		
		int fib = recursiveFibonacciSeries(a);
		
		System.out.println("Fibonacci series of "+a+" term is :"+fib);
		}catch (Exception e) {
			System.out.println("Invalid input!! Please enter valid input");
		}finally {
			scanner.close();
		}
	}
	
	public static int recursiveFibonacciSeries(int a) {
		if(a == 1 || a == 2) {
			return a - 1;
		}else {
			return recursiveFibonacciSeries(a -1 ) + recursiveFibonacciSeries(a - 2);
		}
	}

}
