package com.saurabh;

import java.util.Scanner;

public class CalculateIncomeTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Please enter employee salary : ");
            double salary = scanner.nextDouble();
            
            if (salary <= 0) {
                System.out.println("Invalid salary amount. Please enter a positive value.");
                return; // Exit the program if the salary is invalid
            }
            
            double tax = 0;

            if (salary >= 250000 && salary <= 500000) {
                tax = salary * 0.05;
                System.out.println("Employee salary is between 2.5L to 5.0L hence employee eligible for 5% tax deduction");
            } else if (salary > 500000 && salary <= 1000000) {
                tax = salary * 0.20;
                System.out.println("Employee salary is between 5.0L to 10.0L hence employee eligible for 20% tax deduction");
            } else {
                tax = salary * 0.30;
                System.out.println("Employee salary is above 10.0L hence employee eligible for 30% tax deduction");
            }

            System.out.println("Tax deduction amount is : " + tax);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid salary amount.");
        } finally {
            scanner.close(); // Close the scanner in a finally block
        }
    }
}
