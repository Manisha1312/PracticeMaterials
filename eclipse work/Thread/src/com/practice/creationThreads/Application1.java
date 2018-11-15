package com.practice.creationThreads;

public class Application1 {

	public static void main(String[] args) {
		
		// creation of thread
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("mani");
		t2.setName("arpi");
		
		t1.start();
		t2.start();

	}

}
