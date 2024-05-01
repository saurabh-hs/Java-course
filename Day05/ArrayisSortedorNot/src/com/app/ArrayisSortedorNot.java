package com.app;

import java.util.Scanner;

//Write a java program to find whether an array is sorted or not

public class ArrayisSortedorNot {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
		System.out.println("Please enter array size : ");
		int arraySize = scanner.nextInt();
		
		int[] arr = new int[arraySize];
		System.out.println("Please enter array elements : ");
		for(int i=0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		boolean sorted = true;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				sorted = false;
				break;
			}
		}
		
		 if (sorted) {
             System.out.println("Array is sorted");
         } else {
             System.out.println("Array is not sorted");
         }
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			scanner.close();
		}

	}

}
