package com.app;

import java.util.Scanner;

/*
 * Write a Java program that asks the user for their age and then uses an if-else statement to determine 
 * whether they are eligible to vote. The voting age is 18. If the user is 18 or older, display "You are eligible to vote"; 
 * otherwise, display "You are not eligible to vote."
 */

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter voter age: ");
		short age = sc.nextShort();
		
		if(age >= 18)
			System.out.println("You are eligible to vote");
		else
			System.out.println("You are not eligible to vote");
		
		sc.close();
	}

}
