package com.app;

// Write a program to print the following pattern:
// *****
// ****
// ***
// **
// *

public class PrintPattern {

    public static void main(String[] args) {
        // Loop through each row
        for (int i = 5; i > 0; i--) { 
            // Loop to print '*' for each row
            for (int j = 0; j < i; j++) { 
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

