package com.saurabh;

//Write a java program to detect double or triple space in String

import java.util.Scanner;

public class DetectDoubleOrTripleSpace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a content: ");
        String content = scanner.nextLine();
        scanner.close();

        int count = 0;
        boolean isDoubleOrTripleSpace = false;

        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) == ' ') {
                count++;
            } else {
                if (count >= 2 && count <= 3) { // Check if count is between 2 and 3
                    isDoubleOrTripleSpace = true;
                    break; // No need to continue checking if double or triple space is found
                }
                count = 0;
            }
        }

        if (isDoubleOrTripleSpace) {
            if (count == 2) {
                System.out.println("Double space is detected in the string");
            } else {
                System.out.println("Triple space is detected in the string");
            }
        } else {
            System.out.println("No double or triple space detected in the given string");
        }
    }
}

