package com.app;

class PriorityThread extends Thread {
	//Constructor of PriorityThread class
	public PriorityThread(String name, int priority) {
		super(name);
		setPriority(priority);
	}
	
	//Override run method to start Thread execution
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()+" with priority "+getPriority()+" is running");
			try {
				//Sleep for a short period to allow context switching
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(getName()+" was interrupted");
			}
		}
	}
}

public class ThreadPriorityExample {

	public static void main(String[] args) {
		//Create three threads with different priority
		PriorityThread thread1 = new PriorityThread("Thread 1", Thread.MIN_PRIORITY);
		PriorityThread thread2 = new PriorityThread("Thread 2", Thread.NORM_PRIORITY);
		PriorityThread thread3 = new PriorityThread("Thread 3", Thread.MAX_PRIORITY);
		
		//start all three threads
		thread1.start();
		thread2.start();
		thread3.start();
		
		//Main thread waits for all threads to complete
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread was interrupted");
		}
		
		System.out.println("All threads have finished execution");

	}

}
