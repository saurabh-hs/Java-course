package com.app;

import java.util.Scanner;

//16461
public class PalindromeCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();

		int originalNum = number;
		int reverseNum = 0;

		// Reversing the number
		for(int temp = number; temp !=0; temp /= 10) {
			int digit = temp % 10;
			reverseNum = reverseNum * 10 + digit;
		}

		// Checking if the number is palindrome
		if(originalNum == reverseNum) {
			System.out.println(originalNum+" is a palindrome number");
		}else {
			System.out.println(originalNum+" is not a palindrome number");
		}
		
		sc.close();

	}
}
