package com.practice.creationThreads;

public class Application3Anonymous {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 6; i++) {

					System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
				}

				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();

				}

			}

		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 6; i++) {

					System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.fillInStackTrace();

				}

			}

		});

		thread1.start();
		thread2.start();

	}

}
