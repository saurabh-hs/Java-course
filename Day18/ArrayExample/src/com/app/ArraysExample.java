package com.app;

public class ArraysExample {

	public static void main(String[] args) {
		//int[] intArray;  //allow
		//int intArray[];  //allow
		
//		int[] integerArray = new int[4];
//		
//		integerArray[0] = 20;
//		integerArray[1] = 12;
		
//		System.out.println(integerArray[0]);
//		System.out.println(integerArray[1]);
//		System.out.println(integerArray[2]);
		
//		for(int i=0; i < integerArray.length; i++) {
//			System.out.println(integerArray[i]);
//		}
		
//		String names[] = {"Jack","Leo","Mark","Ram","Shyam"};
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
//		int intArray[] = {128,35,45,65,34,40,52,83};
		
		//int min = Integer.MAX_VALUE;
		
//		for(int n : intArray) {
//			if(n < min) {
//				min = n;
//			}
//		}
		
//		for(int i = 0; i < intArray.length; i++) {
//			if(intArray[i] < min) {
//				min = intArray[i];
//			}
//		}
		
		//System.out.println("Minimum number is: "+min);
		
		//To Find Maximum number in array
		
		int intArray[] = {128,35,45,657,34,402,52,83};
		
		int max = Integer.MIN_VALUE;
		
//		for(int n : intArray) {
//			if(n > max) {
//				max = n;
//			}
//		}
		
		for(int i = 0; i < intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		
		System.out.println("Maximum number is: "+max);

	}

}
