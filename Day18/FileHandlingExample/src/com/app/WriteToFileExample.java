package com.app;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Write a program that writes the following lines to a file named output.txt:
 * Hello, World!
 * Welcome to file handling in Java.
 */

public class WriteToFileExample {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("output.txt")) {
			writer.write("Hello world!\n");
			writer.write("Welcome to file handling in java.\n");
			System.out.println("Data has been written to the file.");
		}catch(IOException e) {
			System.out.println("An error occurred: "+e.getMessage());
		}

	}

}
