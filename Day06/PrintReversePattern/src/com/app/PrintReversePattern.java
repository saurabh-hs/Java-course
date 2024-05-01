package com.app;

/*Write a function to print the following pattern
****
***
**
*
*/


public class PrintReversePattern {

	public static void main(String[] args) {
		for(int i = 4; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}
