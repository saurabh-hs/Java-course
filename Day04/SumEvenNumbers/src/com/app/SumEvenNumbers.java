package com.app;

import java.util.Scanner;

//Write a program to sum first n even numbers using while loop

public class SumEvenNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please enter a number : ");
			int num = scanner.nextInt();
			
			int sum = findSumOfEvenNumbers(num);
			System.out.println("Sum of first "+num+" even numbers : "+sum);
		} catch(Exception e) {
			
			System.out.println("Invalid input!! Please enter valid input");
		
		} finally {
			scanner.close();
		}
	}
	
	public static int findSumOfEvenNumbers(int n) {
		int i = 1;
		int sum = 0;
		int count = 0;
		
		while(count != n) {
			if(i % 2 == 0) {
				sum = sum + i;
				count++;
			}
			i++;
		}
		
		return sum;
	}

}
