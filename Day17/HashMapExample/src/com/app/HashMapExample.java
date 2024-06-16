package com.app;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program to create a HashMap where keys are student names and values are their grades. Add at least five entries and 
 * then print all the key-value pairs.
 */

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> studentList = new HashMap<>();
		
		//Add data entries into hashmap
		studentList.put("Mack", 89);
		studentList.put("Leo", 92);
		studentList.put("Dustin", 65);
		studentList.put("Mark", 78);
		studentList.put("Ram", 99);
		
		//print all the data entries
		for(Map.Entry<String, Integer> entry: studentList.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

}
