package com.app;

//Shared Counter class
class Counter{
	//field of Counter class
	private int count=0;
	
	//Synchronized method to increment the counter
	public synchronized void increment() {
		count++;
	}
	
	//Method to get the current value of the counter
	public int getCount() {
		return count;
	}
}

//Thread class that increment the counter
class CounterIncrementer extends Thread {
	//Field of CounterIncrementer class
	private Counter counter;
	private int numIncrement;
	
	//Constructor to initialize the counter and the number
	public CounterIncrementer(Counter counter, int numIncrement) {
		this.counter = counter;
		this.numIncrement = numIncrement;
	}
	
	@Override
	public void run() {
		for(int i=0; i < numIncrement; i++) {
			counter.increment();
		}
	}
}

//Main class to create and start the threads
public class SynchronizedCounterExample {

	public static void main(String[] args) {
		Counter counter = new Counter();
		int incrementsPerThread = 100;
		
		//Create two threads that increment the counter
		CounterIncrementer thread1 = new CounterIncrementer(counter, incrementsPerThread);
		CounterIncrementer thread2 = new CounterIncrementer(counter, incrementsPerThread);
		
		//start both threads
		thread1.start();
		thread2.start();
		
		//Main thread waits for both threads to complete
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread was interrupted");
		}
		
		//Print the final value of the counter
		System.out.println("Final counter value: "+counter.getCount());

	}

}
