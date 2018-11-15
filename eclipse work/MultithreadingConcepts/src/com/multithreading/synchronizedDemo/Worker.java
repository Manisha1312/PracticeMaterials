package com.multithreading.synchronizedDemo;

public class Worker {

	private static int count = 0;

	public static void main(String[] args) {

		Worker w1 = new Worker();
		w1.doWork();

	}

	public synchronized void increment(String threadName) {
		count++;
		System.out.println(count);

	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 100000; i++) {
						
						increment(Thread.currentThread().getName());
						

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 100000; i++) {
						
						increment(Thread.currentThread().getName());

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is: " + count);
		
		

	}

}
