package com.app;

import java.util.Scanner;

/*
 * Write a Java program that asks the user to enter three integers. Use if-else statements to determine and display the largest 
 * of the three numbers. Consider cases where some numbers might be the same.
 */

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter three numbers: ");
		int num1 = sc.nextInt();

		int num2 = sc.nextInt();

		int num3 = sc.nextInt();

		try{if(num1 == num2) {
			if(num3 > num1) {
				System.out.println(num3+" is a largest number");			
				return;
			}
		}else {
			if(num2 == num3) {
				if(num1 > num2) {
					System.out.println(num1+" is a largest number");
					return;
				}
			}else {
				if(num1 == num3) {
					if(num2 > num1) {
						System.out.println(num2+" is a largest number");
						return;
					}
				}

			}
		}
		if(num1 > num2) {
			if(num1 > num3)
				System.out.println(num1+" is a largest number");
			else
				System.out.println(num3+" is a largest numberr");
		}else {
			if(num2 > num3)
				System.out.println(num2+" is a largest number");
			else
				System.out.println(num3+" is a largest number");
		}
		}finally {

			sc.close();
		}

	}

}
