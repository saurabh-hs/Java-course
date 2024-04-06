package com.saurabh;

//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade

import java.util.Scanner;

public class EncryptAndDecryptGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your grade : ");
		char grade = sc.next().charAt(0);
		
		grade = (char) (grade + 8);
		
		System.out.println("Encrypted Grade : "+grade);
		
		System.out.println("Enter a number to decrypt the grade : ");
		int num = sc.nextInt();
		
		System.out.println("Grade of user is : "+(char)(grade - num));
		
		sc.close();
	}

}
