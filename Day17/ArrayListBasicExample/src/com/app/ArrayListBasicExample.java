package com.app;

/*
 * Write a program to create a ArrayList of integers and add the numbers 1 to 10. Then, print all the elements of the list.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasicExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
		
		for(int number: numbers) {
			System.out.println(number);
		}

	}

}
