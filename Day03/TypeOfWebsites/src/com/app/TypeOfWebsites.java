package com.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program to find out the type of website from the url
//.com -> Commercial website
//.org -> organization website
//.in -> Indian website

public class TypeOfWebsites {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please enter website : ");
			String website = scanner.nextLine();
			
			// Create a pattern to match the end of the URL for different types of websites
			Pattern pattern = Pattern.compile("\\.(com|org|in)$",Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(website);
			
			if(matcher.find()) { // Check if the pattern is found in the input website
				String domain = matcher.group(1); // Extract the matched domain
				switch (domain) {
				case "com" :
					System.out.println("Commerical website");
					break;
					
				case "org" :
					System.out.println("Organization website");
					break;
					
				case "in" :
					System.out.println("Indian website");
					break;
				}
				
			}else {
				System.out.println("Invalid input!! Please enter a valid website");
			}
			
		} catch(Exception e) {
			
			System.out.println("Invalid input!! Please enter valid input");
			
		} finally {
			scanner.close();
		}

	}

}
