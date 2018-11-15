package com.design.singleton;

public class Singletonythread {


	public static final Singletonythread method1 = new Singletonythread();
	
	private static  Singletonythread method3;
	

	private Singletonythread() {
	}

	public static Singletonythread getInstance() {
		if (method3 == null) {
			synchronized (Singletonythread.class) {
				if (method3 == null) {
					method3 = new Singletonythread();
				}
			}
		}
		return method3;
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			getInstance();
		}
	}
	
	public void main() {
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

		// System.out.println(Thread.currentThread().getName()+"
		// "+thread1.hashCode());
		// System.out.println(Thread.currentThread().getName()+"
		// "+thread2.hashCode());
		System.out.println(method3.hashCode());
	}

}
