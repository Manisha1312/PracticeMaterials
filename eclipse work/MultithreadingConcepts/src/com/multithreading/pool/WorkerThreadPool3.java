package com.multithreading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThreadPool3 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i = 0; i<5;i++){
			executor.submit(new Runnable(){

				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
					System.out.println("hello");
					
				}
				
			});
			
		}

	}

}
