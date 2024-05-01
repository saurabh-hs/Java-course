package com.saurabh;

import java.util.Scanner;

//Write a program to find out whether a student is pass or fail. It requires total 40% and at least 33% in each subject to pass. 
//Assume 3 subjects and take marks as an input from the user

public class StudentPassOrFail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks of English : ");
        byte english = scanner.nextByte();

        System.out.println("Enter marks of Science : ");
        byte science = scanner.nextByte();

        System.out.println("Enter marks of Hindi : ");
        byte hindi = scanner.nextByte();

        scanner.close();

        // Check if all subjects have at least 33 marks
        if (english >= 33 && science >= 33 && hindi >= 33) {
            float total = (english + science + hindi) / 3.0f;

            if (total >= 40) {
                System.out.println("Student is Pass!!");
            } else {
                System.out.println("Student is Failed!!");
            }
        } else {
            System.out.println("Student is Failed!!");
        }
    }
}
