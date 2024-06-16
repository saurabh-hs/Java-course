package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Create a List of strings and sort it in alphabetical order using Collections.sort(). Then sort it in reverse order.
 */

public class CollectionSortAndReverse {

	public static void main(String[] args) {
		//Create a List of strings
		List<String> fruits = new ArrayList<>();
		
		//Add several strings to the list
		fruits.add("apple");
		fruits.add("cherry");
		fruits.add("banana");
		fruits.add("date");
		fruits.add("fig");
		fruits.add("grape");
		fruits.add("elderberry");
		
		//sort the list in alphabetical order
		Collections.sort(fruits);
		System.out.println("List sorted in alphabetical order: ");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//Sort the list in reverse alphabetical order
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println("\nList sorted in reverse alphabetical order:");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
