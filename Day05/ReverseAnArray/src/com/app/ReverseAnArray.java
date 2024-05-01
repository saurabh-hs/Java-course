package com.app;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a java program to reverse an array

public class ReverseAnArray {

	private static final Scanner scanner = new Scanner(System.in);
	private static int arraySize;
	public static void main(String[] args) {
		
		try {
			System.out.println("Please enter array size : ");
			arraySize = scanner.nextInt();
			
			int[] arr = new int[arraySize];
			
			System.out.println("Please enter array elements : ");
			for(int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			
			System.out.println("Normal array : ");
			for(int each : arr) {
				System.out.print(each+" ");
			}
			
			System.out.println('\n'+"Reverse array : ");
			for(int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i]+" ");
			}
			
		} catch(InputMismatchException e) {
			
			System.out.println("Invalid input!! Please enter valid input");
			
		} catch(Exception e) {
			
			System.out.println("An error occured :"+e.getMessage());
			
		} finally {
			scanner.close();
		}

	}

}
