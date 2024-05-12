package com.app;

import java.util.Scanner;

/*
 * A movie theater offers different ticket prices based on the customer's age:

If the customer is 12 years old or younger, the ticket price is $5.00.
If the customer is between 13 and 64 years old, the ticket price is $10.00.
If the customer is 65 years old or older, the ticket price is $7.00.
Write a Java program that prompts the user to enter their age, then uses if-else statements to determine the appropriate 

ticket price based on the given age ranges, and displays the ticket price
 */

public class CalculateTicketPrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter name: ");
		String name = scanner.nextLine();
		
		System.out.println("Please enter age: ");
		int age = scanner.nextInt();
		
		if(age <= 12) {
			System.out.println("Name: "+name+"\n"+"The ticket price is $5.00.");
		}else {
			if(age > 12 && age <= 64) {
				System.out.println("Name: "+name+"\n"+"The ticket price is $10.00.");
			}else {
				System.out.println("Name: "+name+"\n"+"The ticket price is $7.00.");
			}
		}
		
		scanner.close();
	}

}
