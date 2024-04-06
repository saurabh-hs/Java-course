package com.saurabh;

//Write a java program to convert a String to lower case and upper case

import java.util.Scanner;

public class StringToLowerCaseAndUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a name : ");
		String name = sc.nextLine();
		
		System.out.println("Lower case input : "+name.toLowerCase());
		System.out.println("Upper case input : "+name.toUpperCase());
		
		sc.close();

	}

}
