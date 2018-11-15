package com.multithreading.synchronizedDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker2 {

	private Random random = new Random();

	List<Integer> li = new ArrayList<>();

	public static void main(String[] args) {
		Worker2 w1 = new Worker2();
		w1.doWork();

	}

	public synchronized void stageOne() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		li.add(random.nextInt(100));
		System.out.println(li);

	}

	public void process(String threadName) {

		for (int i = 0; i < 10; i++) {
			stageOne();

		}

	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process(Thread.currentThread().getName());

			}

		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				process(Thread.currentThread().getName());
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
		System.out.println(li.size());

	}

}
