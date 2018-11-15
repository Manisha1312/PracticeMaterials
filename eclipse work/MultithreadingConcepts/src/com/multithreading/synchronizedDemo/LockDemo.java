package com.multithreading.synchronizedDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LockDemo {

	private Random random = new Random();

	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	List<Integer> l1 = new ArrayList<>();
	List<Integer> l2 = new ArrayList<>();

	public static void main(String[] args) {
		LockDemo list = new LockDemo();
		list.doWork();

	}

	public void stageOne() {

		synchronized (lock1) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l1.add(random.nextInt(100));
			System.out.println(Thread.currentThread().getName());
			System.out.println("hello i am in stageOne");
		}

	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l2.add(random.nextInt(100));
			System.out.println(Thread.currentThread().getName());
			System.out.println("hello i am in stage two");

		}

	}

	public void doProcess() {
		for (int i = 0; i < 10; i++) {
			stageOne();
			stageTwo();

		}
	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				doProcess();

			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				doProcess();

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

		System.out.println("size of the list:" + l1.size() + "  " + l2.size());
	}

}
