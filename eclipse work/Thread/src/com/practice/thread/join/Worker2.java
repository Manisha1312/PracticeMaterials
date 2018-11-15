// to increment count we kept in common method and method should be synchrognized
package com.practice.thread.join;

import java.util.logging.Level;

public class Worker2 {
	private int count = 0;

	public static void main(String[] args) {

		Worker2 worker = new Worker2();
		worker.doWork();
	}

	public synchronized void increment(String threadName) throws InterruptedException {
		count++;
		// Thread.sleep(1000);
		System.out.println("Thread in Progress: " + threadName + " and count is: " + count);
	}

	private void doWork() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {

					try {
						increment(Thread.currentThread().getName());

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100000; i++) {
					try {
						increment(Thread.currentThread().getName());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println("Count is: " + count);

	}

}
