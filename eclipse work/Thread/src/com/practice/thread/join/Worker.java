// here after 2or 3 runs count varies because count is increment locally so there can be  case the upated one not be reflected
// as we are sharing the resource count we neeed to keep in mind something can go wrong

package com.practice.thread.join;

import java.util.logging.Level;

public class Worker {
	private int count = 0;

	public static void main(String[] args) {

		Worker worker = new Worker();
		worker.doWork();
	}

	private void doWork() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {

					try {
						count++;
						System.out.println(Thread.currentThread().getName()+" "+i);
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
						count++;
						System.out.println(Thread.currentThread().getName()+" "+i);
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
