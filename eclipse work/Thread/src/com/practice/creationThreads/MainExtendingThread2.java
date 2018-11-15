package com.practice.creationThreads;

public class MainExtendingThread2 {

	public static void main(String[] args) {
		
		ExtendingThread2 thread1 = new ExtendingThread2();
		
		ExtendingThread2 thread2 = new ExtendingThread2();
		
		
		thread1.start();
		thread2.start();
		

	}

}
