package com.multithreading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerPool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Worker worker = new Worker();
		for(int i = 0;i<2;i++){
			executor.submit(worker);
		}
		executor.shutdown();
		
	System.out.println(worker.l1.size()+"   "+worker.l2.size());	
		
		

	}
	

}
