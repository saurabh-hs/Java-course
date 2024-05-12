package com.app;

import java.util.Scanner;

/*
 * Write a Java program that prompts the user to enter a student's exam score (a value between 0 and 100), and then uses if-else statements to determine the corresponding letter grade based on the following grading scale:

90-100: A
80-89: B
70-79: C
60-69: D
Below 60: F
The program should then display the letter grade.

 */

public class GradeEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking exam score as a input from user
		System.out.println("Please enter exam score: ");
		int score = sc.nextInt();
		
		if(score >=90 && score <= 100)
			System.out.println("A grade");
		else
			if(score >= 80 && score <= 89)
				System.out.println("B grade");
			else
				if(score >= 70 && score <= 79)
					System.out.println("C grade");
				else
					if(score >= 60 && score <= 69)
						System.out.println("D grade");
					else
						System.out.println("F grade");
		
		sc.close();

	}

}
