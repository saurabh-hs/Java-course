package com.app;

/*
 * Write a program that creates and starts two threads, giving them custom names. Print the names of the threads 
 * from within the run method
 */

class CustomThreadName extends Thread {
	//Constructor of CustomThreadName class
	public CustomThreadName(String name) {
		super(name);//set the thread's name
	}
	
	//Override the run method
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread "+getName()+" is running. Iteration"+i);
			try {
				Thread.sleep(500); //sleep for 500 milliseconds
			}catch(InterruptedException e) {
				System.out.println("Thread "+getName()+" was interrupted.");
			}
		}
		System.out.println("Thread "+getName()+" has finished.");
	}
}

public class ThreadNameExample {

	public static void main(String[] args) {
		//Create two threads with custom names
		CustomThreadName thread1 = new CustomThreadName("CustomThread1");
		CustomThreadName thread2 = new CustomThreadName("CustomThread2");
		
		//start both threads
		thread1.start();
		thread2.start();
		
		//Main thread waits for both threads to complete
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread was interrupted.");
		}
		
		System.out.println("Both threads have finished execution.");
	}

}
