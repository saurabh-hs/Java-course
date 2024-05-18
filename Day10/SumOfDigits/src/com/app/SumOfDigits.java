package com.app;

import java.util.Scanner;

/*
 *  Write a Java program to calculate the sum of digits of a given number using a for loop.
 */

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//take a input from user
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();

		int sumOfDigit = 0;
		
		//to get single digit from integer number & add digits
		for(int temp = num; temp != 0; temp /= 10) {
			int digit = temp % 10;
			sumOfDigit += digit;
		}

		System.out.println("Total sum of digits: "+sumOfDigit);
		sc.close();

	}

}