package com.app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterationOverACollection {

	public static void main(String[] args) {
		List<String> stringList = new LinkedList<>();
		
		//Add serveral string into LinkedList
		stringList.add("Ram");
		stringList.add("Gopal");
		stringList.add("Leo");
		stringList.add("Spider man");
		stringList.add("Super man");
		
		//normal for loop
		System.out.println("Using a for loop:");
		for(int i=0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}
		
		//using enhance for loop
		System.out.println("\nUsing an enhanced for loop:");
		for(String word : stringList) {
			System.out.println(word);
		}
		
		//Iterate over the list using an Iterator
		System.out.println("\nUsing an Iterator: ");
		Iterator<String> iterator = stringList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
