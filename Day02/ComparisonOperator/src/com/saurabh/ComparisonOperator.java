package com.saurabh;

//Use comparison operators to find out whether a given number is greater than the user entered number or not

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 67;
		
		System.out.println("Please enter a number : ");
		int input = sc.nextInt();
		
		if(input > number)
			System.out.println("User enter number is greater");
		else
			System.out.println("User enter number is less");
		
		sc.close();
	}

}
