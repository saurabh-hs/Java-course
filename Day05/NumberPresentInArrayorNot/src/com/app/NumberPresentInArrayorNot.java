package com.app;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program to find out whether a given integer is present in an array or not

public class NumberPresentInArrayorNot {

	private static final Scanner scanner = new Scanner(System.in);
	private static int arraySize;
	public static void main(String[] args) {
		
	try {
	
		System.out.println("Please enter array size : ");
		arraySize = scanner.nextInt();
		
		int[] arr = new int[arraySize];
		
		System.out.println("Please enter a array elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Please enter a element you want to search in arrya : ");
		int searchElement = scanner.nextInt();
		
		 boolean found = false;
         for (int element : arr) {
             if (element == searchElement) {
                 found = true;
                 break;
             }
         }

         if (found) {
             System.out.println("Element is present in the array.");
         } else {
             System.out.println("Element is not present in the array.");
         }
		
	} catch (InputMismatchException e) {
	
		System.out.println("Invalid input!! Please enter valid input");
		
	} catch(Exception e) {
	
		System.out.println("An error occured : "+e.getMessage());
		
	} finally {
		
		scanner.close();
	
	}

	}

}
