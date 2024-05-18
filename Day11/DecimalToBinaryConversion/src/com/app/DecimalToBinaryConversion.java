package com.app;

import java.util.Scanner;

/*
 * Write a program to convert a given decimal number to its binary equivalent using a while loop.
 */

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive integer number: ");
		int n = sc.nextInt();
		int originalNum = n;
		
		StringBuilder binaryNum = new StringBuilder();

		//iterate loop till n is equal to 0
		while(n != 0) {
			int rem = n % 2;
			binaryNum.append(rem);
			n = n / 2;
		}
		
		// Since the binary number is constructed in reverse order, reverse it
		binaryNum.reverse();

		System.out.println("Binary number of "+originalNum+" is:"+binaryNum);
		sc.close();
	}
}