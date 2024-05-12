package com.app;

import java.util.Scanner;

/*
 * Write a Java program that prompts the user to enter an hour of the day (a number between 0 and 23) and then uses 
 * if-else statements to determine the appropriate greeting based on the time:

0 to 11: "Good morning!"
12 to 17: "Good afternoon!"
18 to 23: "Good evening!"
Display the correct greeting based on the provided hour.

 */

public class TimeOfDayGreeting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an hour of the day in HH:MM format: ");
		double time = sc.nextDouble();
		
		if(time > 0 && time <= 11)
			System.out.println("Good morning!");
		else
			if(time > 12 && time <= 17)
				System.out.println("Good afternoon!");
			else
				System.out.println("Good evening!");
		
		sc.close();
	}

}
