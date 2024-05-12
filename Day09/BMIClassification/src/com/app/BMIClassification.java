package com.app;

import java.util.Scanner;

/*
 * Write a Java program that calculates the Body Mass Index (BMI) given a person's weight in kilograms and height in meters. 
 * Use the following BMI categories to classify the result:

Below 18.5: Underweight
18.5 to 24.9: Normal weight
25 to 29.9: Overweight
30 or above: Obese

Prompt the user to enter their weight and height, calculate the BMI, and use if-else statements to classify it into one 
of the categories. Display the corresponding message.
 */

public class BMIClassification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter weight in kg: ");
		int weight = sc.nextInt();
		
		System.out.println("Please enter height in meters: ");
		double height = sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		if(BMI < 18.5)
			System.out.println("Underweight");
		else
			if(BMI > 18.5 && BMI <= 24.9)
				System.out.println("Normal weight");
			else
				if(BMI >= 25 && BMI <= 29.9)
					System.out.println("Overweight");
				else
					System.out.println("Obese");
		
		sc.close();

	}

}
