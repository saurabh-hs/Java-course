package com.app;

//Define a class that extends Thread class
public class MyThread extends Thread {
	//Field of MyThread class
	private String threadName;
	
	//Constructor of MyThread class
	public MyThread(String name) {
		this.threadName = name;
	}
	
	//Override the run method to define the thread's behavior
	@Override
	public void run() {
		System.out.println(threadName+" is running");
		try {
			//Sleep for 1 second
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(threadName+" was interrupted");
		}
		System.out.println(threadName+" has finished running");
	}
	
	//Main class to create and start the threads
	public static void main(String[] args) {
		// Create two instances of MyThread
		MyThread thread1 = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");
		
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
		
		System.out.println("Both threads have finished execution");
	}

}
