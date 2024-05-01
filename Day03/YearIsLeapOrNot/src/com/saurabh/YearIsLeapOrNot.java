package com.saurabh;

import java.util.Scanner;

//Write a program to find out user enter year is leap year or not


public class YearIsLeapOrNot {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please enter a year : ");
			int year = scanner.nextInt();
			if(year % 400 == 0 || year % 4 == 0) {
				System.out.println(year+" is a leap year");
			}else {
				System.out.println(year+" is not a leap year");
			}
			
		} catch(Exception e) {
			System.out.println("Invalid input!! Please enter valid input");
		}finally {
			scanner.close();
		}
	}

}
