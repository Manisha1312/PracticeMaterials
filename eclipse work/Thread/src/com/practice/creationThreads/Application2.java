package com.practice.creationThreads;

public class Application2 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadRunnable());
		Thread t2 = new Thread(new ThreadRunnable());
		
		t1.start();
		t2.start();

	}

}
