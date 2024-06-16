package com.app;

import java.util.PriorityQueue;
import java.util.Random;

/*
 * Create a PriorityQueue of integers. Add some random integers to the queue and then remove and print each element until the queue is empty.
 */

public class QueueExample {

	public static void main(String[] args) {
		//Create object of PriorityQueue class
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		//Create a instance of Random to generate random integers
		Random random= new Random();
		
		//Add some random integers to the queue
		for(int i = 0; i < 10; i++) {
			int randomNum = random.nextInt(100); //Generate a random numbers between 0 and 99
			queue.add(randomNum);
			System.out.println("Added: "+randomNum);
		}
		
		//removing and printing elements from the queue
		System.out.println("\nRemoving and printing elements from the PriorityQueue: ");
		
		//Remove and print each element until the queue is empty
		while(!queue.isEmpty()) {
			System.out.println("Removed: "+queue.poll());
		}
	}
}
