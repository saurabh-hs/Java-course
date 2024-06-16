package com.app;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		//int[][] array; //allowed
		//int array1[][]; //allowed
		
//		int[][] marks = new int[3][4];
//		
//		marks[0][0] = 12;
//		marks[0][1] = 67;
//		marks[0][2] = 98;
//		marks[0][3] = 90;
//		
//		marks[1][0] = 20;
//		marks[1][1] = 87;
//		marks[1][2] = 94;
//		marks[1][3] = 87;
//		
//		marks[2][0] = 12;
//		marks[2][1] = 67;
//		marks[2][2] = 98;
//		marks[2][3] = 90;
		
		int marks[][] = {
				{12, 67, 45, 88},
				{20, 87, 99, 85},
				{15, 33, 40, 25}
		};
		
		for(int[] mark : marks) {
			for(int n : mark) {
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
