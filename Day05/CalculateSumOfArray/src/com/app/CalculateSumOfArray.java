package com.app;

import java.util.InputMismatchException;
import java.util.Scanner;

//Create an array of 5 float numbers & calculate their sum

public class CalculateSumOfArray {
	
	private static final int ARRAY_SIZE = 5;
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		try {
			
			float[] arr = new float[ARRAY_SIZE];
			
			System.out.println("Please enter a number : ");
			
			acceptArrayValues(arr);
			
			float sum = 0;
			
			sum = calculateSum(arr);
			
			System.out.println("Sum of array is : "+sum);
			
		} catch(InputMismatchException e) {
			
			System.out.println("Invalid input!! Please enter valid input");
			
		} catch(Exception e) {
			
			System.out.println("An error occurred: "+ e.getMessage());
			
		} finally {
			scanner.close();
		}
			

	}
	
	public static void acceptArrayValues(float[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextFloat();
		}
	}
	
	public static float calculateSum(float arr[]) {
		float sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}


}
