package com.saurabh;

import java.util.Scanner;

//Write a java program to find out the day of the week given the number[1 for Monday, 2 for Tuesday... and so on]

public class FindDayOfTheWeekGivenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
		System.out.println("Please enter a number : ");
		byte number = scanner.nextByte();
		
		if(number <= 0 && number >=8) {
			System.out.println("Invalid input!! Please enter positive number or greater than 0");
			return;
		}
		 switch(number) {
		 case 1: {
			 System.out.println("Monday");
			 break;
		 }
		 
		 case 2: {
			 System.out.println("Tuesday");
			 break;
		 }
			
		 case 3: {
			 System.out.println("Wednesday");
			 break;
		 }
		 
		 case 4: {
			 System.out.println("Thursday");
			 break;
		 }
		 
		 case 5: {
			 System.out.println("Friday");
			 break;
		 }
		 
		 case 6: {
			 System.out.println("Saturday");
			 break;
		 }
		 
		 case 7: {
			 System.out.println("Sunday");
			 break;
		 }
		 
		 }
		} catch (Exception e){
			System.out.println("Invalid input!! Please enter valid input");
		}finally {
			scanner.close();
		}

	}

}
