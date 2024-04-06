package com.saurabh;

//Write a java program to find & replace character

import java.util.Scanner;

public class SpaceReplaceWithUnderscore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a input : ");
		String str = sc.nextLine();
		
		System.out.println("Before space replace : "+str);
		
		System.out.println("Please enter what you want to find :");
		String find = sc.next();
		
		System.out.println("Please enter what you want to replace :");
		String reps = sc.next();
	
		str = str.replace(find, reps);
		System.out.println("After space replace : "+str);
		
		sc.close();
	}

}
