package com.design.singleton;

public class MainThreadSingleton {

	public static void main(String[] args) {
		System.out.println("Starting ...");
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	private static void process() {
		System.out.println(Singletonythread.getInstance().hashCode());
	}
}
