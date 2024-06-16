package com.app;

class YieldingThread extends Thread{
	//Field of YieldingThread class
	private String threadName;
	
	//Constructor of YieldingThread class
	public YieldingThread(String name) {
		this.threadName = name;
	}
	
	//Override run method
	@Override
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(threadName + " is running. Iteration: "+i);
			if("YieldingThread".equals(threadName)) {
				Thread.yield(); //Yield execution to allow other threads to run
			}
		}
		System.out.println(threadName+" has finished.");
	}
}

public class ThreadYieldExample {

	public static void main(String[] args) {
		//Create two threads
		YieldingThread thread1 = new YieldingThread("YieldingThread");
		YieldingThread thread2 = new YieldingThread("NormalThread");
		
		//start both threads
		thread1.start();
		thread2.start();
		
		//Main thread waits for both threads to complete
		try {
			thread1.join();
			thread2.join();
		}catch (InterruptedException e) {
			System.out.println("Main thread was interrupted.");
		}
		
		System.out.println("Both threads have finished execution.");
	}

}
