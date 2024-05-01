package com.app;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program to find factorial of a given number using for loop.

public class FindFactorialOfGivenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter a number : ");
            int num = scanner.nextInt();

            if (num >= 0) {
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of " + num + " is " + fact);
            } else {
            	
                System.out.println("Invalid input!! Please enter a non-negative number");
            
            }
        } catch (InputMismatchException e) {
            
        	System.out.println("Invalid input!! Please enter a valid integer");
        
        } catch (Exception e) {
        
        	System.out.println("An error occurred: " + e.getMessage());
        
        } finally {
        
        	scanner.close();
        
        }
    }
}
