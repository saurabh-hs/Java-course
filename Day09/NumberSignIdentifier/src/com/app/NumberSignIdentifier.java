package com.app;

import java.util.Scanner;

/*
 * Write a Java program that prompts the user to enter an integer and then checks whether the number is positive, negative, or zero. 
 * Use if-else statements to make this determination and then display an appropriate message.
 */

public class NumberSignIdentifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number: ");
		int num = sc.nextInt();
		
		if(num == 0)
			System.out.println("Number is zero");
		else
			if(num > 0) 
				System.out.println("Number is positive");
			else
				System.out.println("Number is negative");
		
		sc.close();

	}

}
