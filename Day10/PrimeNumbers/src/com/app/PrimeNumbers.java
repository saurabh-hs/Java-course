package com.app;

import java.util.Scanner;

/*
 * Develop a Java program that prints all prime numbers between 1 and n using a for loop.
 */

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter n value: ");
		int n = sc.nextInt();

		int count=0;

		for(int i=2; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			
			if(count > 2) {
				count = 0;
				continue;
			}else {
				count = 0;
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
