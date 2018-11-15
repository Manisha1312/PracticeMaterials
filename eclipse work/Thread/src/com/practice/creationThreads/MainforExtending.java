package com.practice.creationThreads;

public class MainforExtending {

	public static void main(String[] args) {
		
		ExtendingThread t1 = new ExtendingThread();
		
		ExtendingThread t2 = new ExtendingThread();
		
		t1.setName("arpi");
		t2.setName("mani");
		
		t1.start();
		t2.start();
		

	}

}
