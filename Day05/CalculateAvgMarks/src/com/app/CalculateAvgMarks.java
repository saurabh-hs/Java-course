package com.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateAvgMarks {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int[] physicsMarks = new int[5];
            int sum = 0;

            System.out.println("Please enter students' physics marks:");
            for (int i = 0; i < physicsMarks.length; i++) {
                physicsMarks[i] = scanner.nextInt();
                sum += physicsMarks[i]; // Summing up the marks as they are entered
            }

            double average = (double) sum / physicsMarks.length; // Calculating the average as a double
            System.out.println("Avg marks: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid input.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
