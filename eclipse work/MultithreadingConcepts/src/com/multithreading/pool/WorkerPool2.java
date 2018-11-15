package com.multithreading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class WorkerPool2 {

	public static void main(String[] args) {
	
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i =0;i<10;i++){
	Future future =  executor.submit(new Worker2(i));
			
		}
		
		 executor.shutdown();
		 
		
   
	}
	
	

}
