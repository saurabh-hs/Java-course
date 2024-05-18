package com.app;

import java.util.Scanner;

/*
 * Write a Java program that takes 10 integers from the user using a for loop and prints their average value.
 */

public class CalculateAvgOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 numbers: ");
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			sum += arr[i];
		}
		
		System.out.println("Average value is: "+(sum/arr.length));
		
		sc.close();

	}

}
